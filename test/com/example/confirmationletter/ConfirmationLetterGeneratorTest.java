package com.example.confirmationletter;

import com.example.domain.*;
import com.example.record.command.FileUploadCommand;
import com.example.record.domain.FaultRecord;
import com.example.record.domain.Record;
import com.example.record.domain.TempRecord;
import com.example.record.parser.FileExtension;
import com.example.record.service.impl.Constants;
import org.approvaltests.Approvals;
import org.springframework.webflow.execution.RequestContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;


public class ConfirmationLetterGeneratorTest {

    @org.junit.Test
    public void letter() {
        ConfirmationLetterGenerator gen = new ConfirmationLetterGenerator();
        LetterSelector letterSelector = new LetterSelector();
        gen.setLetterSelector(letterSelector);
        RequestContext ctx = new RequestContext();
        FileUploadCommand fileUploadCommand = new FileUploadCommand();
        Client client = new Client();
        client.setCreditDebit(Constants.DEBIT);
        client.setAmountDivider(3.5);
        client.setCounterTransfer(Constants.FALSE);
        Profile profile = new Profile();

        client.setProfile(profile);
        HashBatchRecordsBalance hashBashRecordsBalance = new HashBatchRecordsBalance();
        hashBashRecordsBalance.setHashTotalCredit(80000.0);
        hashBashRecordsBalance.setHashTotalDebit(13549.11);
        hashBashRecordsBalance.setCollectionType("Fast");
        hashBashRecordsBalance.setTotalFee(49.85);
        hashBashRecordsBalance.setRecordsTotal(314.33);
        HashMap<Integer, BatchTotal> batchTotals = new HashMap<>();
        batchTotals.put(6,new BatchTotal(BigDecimal.valueOf(13), BigDecimal.valueOf(49)));
        batchTotals.put(27,new BatchTotal(BigDecimal.valueOf(2300), BigDecimal.valueOf(1699)));
        hashBashRecordsBalance.setBatchTotals(batchTotals);
        ArrayList<AmountAndRecordsPerBank> bankMap = new ArrayList<>();
        AmountAndRecordsPerBank anr = new AmountAndRecordsPerBank();
        anr.setBankName("Wells Fargo Bank");
        anr.setAccountNumber(31415);
        anr.setCurrencyType(Constants.CURRENCY_EURO);
        anr.setAmount(BigDecimal.valueOf(234532.23));
        anr.setTotalRecord(1);
        bankMap.add(anr);
        FaultRecord faultRecord = (FaultRecord)createRecord(true, "Wells Fargo", BigDecimal.valueOf(2342.24), "Captain America", 12);
        ArrayList<FaultRecord> faultRecords = new ArrayList<>();
        faultRecords.add(faultRecord);
        FileExtension extension = new FileExtension(".txt");
        TempRecord record = (TempRecord) createRecord(false, "Chase Bank", BigDecimal.valueOf(19678.78), "Iron Man", 6);
        ArrayList<Record> records = new ArrayList<>();
        records.add(record);
        TempRecord tempRecord1 = (TempRecord)createRecord(false, "Sun Life Bank", BigDecimal.valueOf(8733.19), "Black Widow", 3);
        ArrayList<TempRecord> faultyAccountNumberRecordsList = new ArrayList<>();
        faultyAccountNumberRecordsList.add(tempRecord1);
        TempRecord record1 = (TempRecord)createRecord(false, "Prosperity Bank", BigDecimal.valueOf(53247.67), "Wonder Woman", 7);
        ArrayList<TempRecord> sansDuplicateFaultRecordsList = new ArrayList<>();
        sansDuplicateFaultRecordsList.add(record1);
        OurOwnByteArrayOutputStream stream = gen.letter(ctx,fileUploadCommand,client,hashBashRecordsBalance,"Houston Branch", bankMap, faultRecords, extension, records, faultyAccountNumberRecordsList, sansDuplicateFaultRecordsList);
        fileUploadCommand.setFee("no");
        OurOwnByteArrayOutputStream stream2 = gen.letter(ctx,fileUploadCommand,client,hashBashRecordsBalance,"Houston Branch", bankMap, faultRecords, extension, records, faultyAccountNumberRecordsList, sansDuplicateFaultRecordsList);
        Approvals.verify(stream.toString() + stream2.toString());
    }

    private Record createRecord(boolean faultRecord, String bankName, BigDecimal amount, String beneficiaryName, Integer beneficiaryAccountNumber) {
        Record record;
        if (faultRecord) {
            record = new FaultRecord();
        } else {
            record = new TempRecord();
        }
        record.setCurrencyCode(Constants.EUR_CURRENCY_CODE);
        record.setSign("-");
        record.setCurrency(new Euros());
        record.setAmount(amount);
        Bank recordBank = new Bank();
        recordBank.setName(bankName);
        record.setBank(recordBank);
        record.setBeneficiaryName(beneficiaryName);
        record.setBeneficiaryAccountNumber(beneficiaryAccountNumber);
        record.setFreeRecord(2);
        record.setIsCounterTransferRecord(1);
        return record;
    }
}
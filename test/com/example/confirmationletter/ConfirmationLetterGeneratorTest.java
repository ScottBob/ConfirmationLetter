package com.example.confirmationletter;

import com.example.domain.*;
import com.example.record.command.FileUploadCommand;
import com.example.record.domain.FaultRecord;
import com.example.record.domain.Record;
import com.example.record.domain.TempRecord;
import com.example.record.parser.FileExtension;
import com.example.record.service.impl.Constants;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.approvaltests.Approvals;
import org.springframework.webflow.execution.RequestContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;


public class ConfirmationLetterGeneratorTest {
    String[] creditDebit = {Constants.CREDIT, Constants.DEBIT};
    Currency[] currencies = {new Dollars(), new Euros(), new Pound(), new Yen()};
    String[] hasFee = {Constants.YES, Constants.NO};
    String[] counterTransfer = {Constants.TRUE, Constants.FALSE};


    @org.junit.Test
    public void letter() {
        ConfirmationLetterGenerator gen = new ConfirmationLetterGenerator();
        LetterSelector letterSelector = new LetterSelector();
        gen.setLetterSelector(letterSelector);
        RequestContext ctx = new RequestContext();
        FileUploadCommand fileUploadCommand = new FileUploadCommand();
        Client[] clients = generateClients();
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
        FaultRecord faultRecord = (FaultRecord)createRecord(true, "Wells Fargo", BigDecimal.valueOf(2342.24), "Captain America", 12, Constants.EUR_CURRENCY_CODE, Constants.DEBIT);
        ArrayList<FaultRecord> faultRecords = new ArrayList<>();
        faultRecords.add(faultRecord);
        FileExtension extension = new FileExtension(".txt");
        TempRecord record = (TempRecord) createRecord(false, "Chase Bank", BigDecimal.valueOf(19678.78), "Iron Man", 6, Constants.EUR_CURRENCY_CODE, Constants.DEBIT);
        ArrayList<Record> records = new ArrayList<>();
        records.add(record);
        TempRecord tempRecord1 = (TempRecord)createRecord(false, "Sun Life Bank", BigDecimal.valueOf(8733.19), "Black Widow", 3, Constants.FL_CURRENCY_CODE_FOR_WEIRD_BANK, Constants.CREDIT);
        ArrayList<TempRecord> faultyAccountNumberRecordsList = new ArrayList<>();
        faultyAccountNumberRecordsList.add(tempRecord1);
        TempRecord record1 = (TempRecord)createRecord(false, "Prosperity Bank", BigDecimal.valueOf(53247.67), "Wonder Woman", 7, Constants.FL_CURRENCY_CODE_FOR_WEIRD_BANK, Constants.CREDIT);
        ArrayList<TempRecord> sansDuplicateFaultRecordsList = new ArrayList<>();
        sansDuplicateFaultRecordsList.add(record1);
        TempRecord tempRecord2 = (TempRecord)createRecord(false, "Citibank", BigDecimal.valueOf(6733.19), "Ant Man", 3, Constants.FL_CURRENCY_CODE, Constants.DEBIT);
        records.add(tempRecord2);
        TempRecord record2 = (TempRecord)createRecord(false, "Bank of America", BigDecimal.valueOf(12247.67), "Batman", 7, Constants.USD_CURRENCY_CODE, Constants.DEBIT);
        records.add(record2);
        OurOwnByteArrayOutputStream stream = gen.letter(ctx,fileUploadCommand,clients[0],hashBashRecordsBalance,"Houston Branch", bankMap, faultRecords, extension, records, faultyAccountNumberRecordsList, sansDuplicateFaultRecordsList);
        fileUploadCommand.setFee("no");
        OurOwnByteArrayOutputStream stream2 = gen.letter(ctx,fileUploadCommand,clients[1],hashBashRecordsBalance,"Houston Branch", bankMap, faultRecords, extension, records, faultyAccountNumberRecordsList, sansDuplicateFaultRecordsList);
        Approvals.verify(stream.toString() + stream2.toString());
    }

    private Client[] generateClients() {
        ArrayList<Client> clients = new ArrayList<>();
        double divider = 5;
        for (String cd : creditDebit) {
            for (String ct : counterTransfer) {
                Client client = new Client(cd, new Profile(), ct, divider /= 2);
                clients.add(client);
            }
        }
        Client[] clientArray = new Client[clients.size()];
        for (int i = 0; i < clients.size(); ++i) {
            clientArray[i] = clients.get(i);
        }
        return clientArray;
    }

    private Record createRecord(boolean faultRecord, String bankName, BigDecimal amount, String beneficiaryName, Integer beneficiaryAccountNumber, String currencyCode, String sign) {
        int isCounterTransferRecord = 1;
        Record record;
        if (faultRecord) {
            record = new FaultRecord();
        } else {
            record = new TempRecord();
        }
        record.setCurrencyCode(currencyCode);
        record.setSign(sign);
        Currency currency = new Euros();
        record.setCurrency(currency);
        record.setAmount(amount);
        Bank recordBank = new Bank();
        recordBank.setName(bankName);
        record.setBank(recordBank);
        record.setBeneficiaryName(beneficiaryName);
        record.setBeneficiaryAccountNumber(beneficiaryAccountNumber);
        record.setFreeRecord(2);
        record.setIsCounterTransferRecord(isCounterTransferRecord);
        return record;
    }
}
package org.springframework.webflow.execution;

import com.oracle.webservices.internal.api.message.PropertySet;

import java.util.HashMap;
import java.util.Map;

public class RequestContext {
    public PropertySet getConversationScope() {
        PropertySet ps = new PropertySet() {
            HashMap<String, Object> stuff = new HashMap<>();

            @Override
            public boolean containsKey(Object o) {
                return stuff.containsKey(o);
            }

            @Override
            public Object get(Object o) {
                return stuff.get(o);
            }

            @Override
            public Object put(String s, Object o) {
                return stuff.put(s, o);
            }

            @Override
            public boolean supports(Object o) {
                return true;
            }

            @Override
            public Object remove(Object o) {
                return stuff.remove(o);
            }

            @Override
            public Map<String, Object> createMapView() {
                return stuff;
            }

            @Override
            public Map<String, Object> asMap() {
                return stuff;
            }
        };
        return ps;
    }
}

package com.prachi.map;

import java.util.HashMap;

public class NewMap extends HashMap<String, Integer> {

    @Override
    public Integer get(Object key) {
        return super.get(key);
    }

    @Override
    public Integer put(String key, Integer value) {
        return super.put(key, value);
    }

    @Override
    public int size() {
        return super.size();
    }
}

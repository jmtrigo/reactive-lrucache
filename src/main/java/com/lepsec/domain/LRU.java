package com.lepsec.domain;

/**
 * Created by jnieto on 13/2/17.
 */
public interface LRU {
    void put(int key, String value);
    String get(int key) throws Exception;
}

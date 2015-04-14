/**
 * Created by Natalia on 26.03.2015.
 */
package com.slabkiy.hashtable;
public class Pair<keyType,valueType> {
    private final keyType key;
    private final valueType value;

    public Pair(keyType key, valueType value) {
        this.key = key;
        this.value = value;
    }
    public keyType getKey() {
        return key;
    }

    public valueType getValue() {
        return value;
    }
}
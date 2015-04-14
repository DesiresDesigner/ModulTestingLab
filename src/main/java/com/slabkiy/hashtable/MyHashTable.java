/**
* Created by Natalia on 26.03.2015.
*/
package com.slabkiy.hashtable;
interface MyHashTable<keyType,valueType> {
    public  boolean  push(keyType key, valueType value);
    public  boolean delete(keyType key);
    public  valueType  get(keyType key);
}



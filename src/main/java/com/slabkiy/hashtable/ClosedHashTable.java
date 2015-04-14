package com.slabkiy.hashtable;

/**
 * Created by Natalia on 26.03.2015.
 */

import javafx.util.Pair;

import java.util.ArrayList;

public class ClosedHashTable<keyType, valueType> extends HashReturn implements MyHashTable<keyType, valueType> {
    private ArrayList<Pair<keyType, valueType>>[] table;

    public ClosedHashTable() {
        table = new ArrayList[1000];
    }

    public boolean push(keyType key, valueType value) {
        int hc = returnHash(key);
        int size;
        try {
            size = table[hc].size();
        } catch (NullPointerException e){
            table[hc] = new ArrayList<Pair<keyType, valueType>>();
            size = 0;
        }
        for (int i = 0; i < size; i++) {
            if (table[hc].get(i).getKey().equals(key)) {
                table[hc].set(i, new Pair<keyType, valueType>(key, value));
                return false;
            }
        }
        table[hc].add(new Pair<keyType, valueType>(key, value));
        return true;
    }

    public boolean delete(keyType key) {
        int hc = returnHash(key);
        int size;
        try {
            size = table[hc].size();
        } catch (NullPointerException e) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (table[hc].get(i).getKey().equals(key)) {
                table[hc].remove(i);
                return true;
            }
        }
        return false;
    }

    public valueType get(keyType key) {
        int hc = returnHash(key);
        int size;
        try {
            size = table[hc].size();
        } catch (NullPointerException e){
            return  null;
        }
        for (int i = 0; i < size; i++) {
            if (table[hc].get(i).getKey().equals(key)) {
                return table[hc].get(i).getValue();
            }
        }
        return null;
    }
}


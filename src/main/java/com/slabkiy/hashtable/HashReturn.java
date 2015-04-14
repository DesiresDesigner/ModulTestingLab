/**
 * Created by Natalia on 26.03.2015.
 */
package com.slabkiy.hashtable;
public class HashReturn<hashCod> {
    public int returnHash(hashCod hc){
        return Math.abs(hc.hashCode()%1000);
    }
}
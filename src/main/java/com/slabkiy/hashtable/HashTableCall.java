package com.slabkiy.hashtable;
import java.util.Scanner;

/**
 * Created by Natalia on 26.03.2015.
 */
public class HashTableCall {
    public static void main(String[] args) {
        MyHashTable<String, String> table = new ClosedHashTable<String, String>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of operations: ");
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String s = in.next();
            if(s.equals("p")){
                System.out.print("Enter key: ");
                String key = in.next();
                System.out.print("Enter value: ");
                String val = in.next();
                table.push(key, val);
                System.out.print("New pair (" + key + ", " + val + ") was created\n");
            }
            if(s.equals("d")){
                System.out.print("Enter key: ");
                String key = in.next();
                table.delete(key);
                System.out.print("Pair with key (" + key + ") was deleted\n");
            }
            if(s.equals("g")){
                System.out.print("Enter key: ");
                String key = in.next();
                String val = table.get(key);
                System.out.print("The value of key " + key + " is " + val + "\n");
            }
        }

        }
}

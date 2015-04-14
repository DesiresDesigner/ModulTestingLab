package com.desiresdesigner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natalia on 26.03.2015.
 */
public class BucketSort {

    public static void sort(int[] items) {
        if (items == null || items.length < 2)
            return;

        int maxValue = items[0];
        int minValue = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i] > maxValue)
                maxValue = items[i];

            if (items[i] < minValue)
                minValue = items[i];
        }

        List<List<Integer>> bucket = new ArrayList(maxValue - minValue + 1);

        for (int i = 0; i < (maxValue - minValue + 1); i++) {
            bucket.add(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < items.length; i++) {
            bucket.get(items[i] - minValue).add(items[i]);
        }

        int position = 0;
        /*for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).size() > 0) {
                for (int j = 0; j < bucket.get(i).size(); j++) {
                    items[position] = bucket.get(i).get(j);
                    position++;
                }
            }
        }*/

        for (List<Integer> i : bucket) {
            if (i.size() > 0) {
                for (int j : i) {
                    items[position] = j;
                    position++;
                }
            }
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortStrategies;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author (Harshilkumar Vaghela, 3116318)
 */
public class MergeSort extends SortStrategy{
    public static void merge(String[] S1, String[] S2, String[] S) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length || (i < S1.length && S1[i].compareTo(S2[j])< 0)) {
                S[i + j] = S1[i++]; // copy ith element of S1 and increment i
            } else {
                S[i + j] = S2[j++]; // copy jth element of S2 and increment j
            }
        }
    }
    public static void mergeSort(String[] S) {
        int n = S.length;
        if (n < 2) {
            return; // array is trivially sorted
        }        // divide
        int mid = n / 2;
        String[] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
        String[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
        // conquer (with recursion)
        mergeSort(S1); // sort copy of first half
        mergeSort(S2); // sort copy of second half
        // merge results
        merge(S1, S2, S); // merge sorted halves back into original
    }

    @Override
    public void Sort(String[] list) {
        System.out.println("Merge sorted list: ");
        mergeSort(list); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortStrategies;

/**
 *
 * @author (Harshilkumar Vaghela, 3116318)
 */
public class SelectionSort extends SortStrategy{

    @Override
    public void Sort(String[] a){
        System.out.println("Selection sorted list: ");
    int n = a.length;
    for (int i=0; i<n-1; i++) {
        int iSmallest = i;
        for (int j=i+1; j<n; j++) {
            if (a[j].compareTo(a[iSmallest])<0) {
                iSmallest = j;
            }
        }
        if(iSmallest != i) {
            String temp = a[i];
            a[i] = a[iSmallest];
            a[iSmallest] = temp;
        }
    }
    }
}

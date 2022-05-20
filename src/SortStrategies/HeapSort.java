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
public class HeapSort extends SortStrategy{

    @Override
    public void Sort(String[] list)
    {System.out.println("heap sorted list: ");
        int n = list.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            String temp = list[0];
            list[0] = list[i];
            list[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(list, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(String arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l].compareTo(arr[largest])>0)
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r].compareTo( arr[largest])>0)
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}

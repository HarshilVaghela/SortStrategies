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
public class sortStrategiesDriver {
    public static void main (String[] args){
        SortedList studentRecords = new SortedList();

 

      studentRecords.Add("Samual",0);

      studentRecords.Add("Jimmy",1);

      studentRecords.Add("Sandra",2);

      studentRecords.Add("Vivek",3);

      studentRecords.Add("Anna",4);

 

      studentRecords.SetSortStrategy(new SelectionSort());

      studentRecords.Sort();

      studentRecords.resetList();

      studentRecords.SetSortStrategy(new HeapSort());

      studentRecords.Sort();

      studentRecords.resetList();

      studentRecords.SetSortStrategy(new MergeSort());

      studentRecords.Sort();
      
    
    }
    
}

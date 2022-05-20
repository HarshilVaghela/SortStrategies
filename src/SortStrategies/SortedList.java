/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortStrategies;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author (Harshilkumar Vaghela, 3116318)
 */
public class SortedList
  {
    private String[] list = new String[5];
    private SortStrategy sortstrategy;

    public void SetSortStrategy(SortStrategy sortstrategy)
    {
      this.sortstrategy = sortstrategy;
    }

    public void Add(String name,int pos)
    {
      list[pos]=name;
    }
    
    public int size()
    {
    return list.length;
    }

    public void Sort()
    {
      sortstrategy.Sort(list);
      // Iterate over list and display results
      for (String name:list)
      {
        System.out.print(" " + name);
      }
      System.out.println();
    }
    public void resetList(){
        Random rand = new Random();
        System.out.println("Unsorted list: ");
		
		for (int i = 0; i < list.length; i++) {
			int randomIndexToSwap = rand.nextInt(list.length);
			String temp = list[randomIndexToSwap];
			list[randomIndexToSwap] = list[i];
			list[i] = temp;
		}
                for (String name:list)
      {
        System.out.print(" " + name);
      }
      System.out.println();
    }

  }



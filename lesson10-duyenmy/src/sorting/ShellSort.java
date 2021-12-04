package sorting;

import java.util.Scanner;

public class ShellSort {
	public static final int SIZE = 5;
    public static int[] array = new int[SIZE];
    
    /**
    *Shell Sort Algorithm.
    **/
    public static void main(String args[])
    {
        System.out.println("Enter 5 Elements");
        Scanner key = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++)
            array[i] = key.nextInt();
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nSorted array: ");
        sort();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    public static void sort()
    {
        int inc = array.length / 2;
        while (inc > 0)
        {
            for (int i = inc; i < array.length; i++)
            {
                int temp = array[i];
                int j = i;
            
                while (j >= inc && array[j - inc] > temp)
                {
                    array[j] = array[j - inc];
                    j = j - inc;
                }
                array[j] = temp;
            }
            if (inc == 2)
                inc = 1;
            else
                inc *= (5.0 / 11);
        }
    }
}

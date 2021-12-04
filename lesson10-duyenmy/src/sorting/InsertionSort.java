package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void  insertSort (int [] array) {
	     for (int  i =  1 ; i < array.length; i++) {
	          int  temp = array[i];
	          int  j = i - 1 ;
	          for  ( j = i - 1 ; j >= 0 && array[j] > temp; j--) {
	          // Moves the value greater than temp back by one unit
	               array [j + 1] = array [j];
	          }
	          array [j + 1] = temp;
	     }
	     System.out.println(Arrays.toString(array) + "insertSort");
	}
	public void display(int arr[]) {
        int i;
        System.out.print("[");
 
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.print("]\n");
    }
}

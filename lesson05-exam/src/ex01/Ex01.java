package ex01;
import java.util.Arrays;
public class Ex01 {
	public static void main(String[] args) {
        System.out.println("welcome");

        int[] arr = new int[]{1, 8, 9, 2, 55, 666};


        //for (int i = 0; i < arr.length - 1 ; i++) {
        //    System.out.println(arr[i] +" ");
       // }
        
        remove(arr,0);
    }

    private static int[] remove(int[] arr, int pos){
        int [] result = new int[arr.length];
       for(int j=0;j< pos;j++) {
    	   result[j] = arr[j];
       }
        for (int i = pos; i < arr.length -1; i++) {
            result[i] = arr[i+1];
        }
       show(result);
        return result;
        }
    private static void  show(int ... arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            System.out.print(arr[i] +" ");
        }
    }

}


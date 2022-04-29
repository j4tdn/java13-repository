package prd_test;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    static int modulo = (int) (Math.pow(10, 9) + 7);
    static int max_int = Integer.MAX_VALUE;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Input the number of elements: ");
        int number = Integer.parseInt(sc.nextLine());
        if(number < 0 || number > Math.pow(10,5)){
            throw new Exception("Constraint: 1<=n<=10^5");
        }
        int[] array = makeArray(number);
        printArray(array, "Array: ");
        int firstIndexOfMaxValue = powerArray(array);
        System.out.println("\nThe first index of maximum value is: " + firstIndexOfMaxValue);
        sc.close();
    }
    private static void printArray(int[] array, String message){
        System.out.println("\n" + message);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
    private static int powerArray(int[] analyzedArray){
        int foundIndex = 0;
        int[] powerArray = new int[analyzedArray.length - 1];
        for(int i = 0; i < powerArray.length; i++){
            int toThePower = (int) Math.pow(analyzedArray[i], analyzedArray[i+1]);
            powerArray[i] = toThePower > max_int ? toThePower % modulo : toThePower;
        }
        printArray(powerArray, "Power Array: ");
        int max = Arrays.stream(powerArray).max().getAsInt();
        for(int i = 0; i<powerArray.length; i++){
            if(powerArray[i] == max){
                foundIndex = i;
            }
        }
        return foundIndex;
    }
    private static int[] makeArray(int number) throws Exception {
        int[] array = new int[number];
        for (int i = 0; i<number; i++){
            array[i] = Integer.parseInt(sc.nextLine());
            if(array[i] < 0 || array[i] > 100){
                throw new Exception("Constraint: 1<=arr[i]<=100");
            }
        }
        return array;
    }
}

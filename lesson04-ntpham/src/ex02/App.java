package ex02;
/**
 * 	Cho một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
	Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. Các số
	vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
 * * @author PhoIndie
 */
import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//System.out.print("Enter n: ");
		//Scanner input = new Scanner(System.in);
		//int n = Integer.parseInt(input.nextLine());
		//input.close();
		
		//int[] randomArray = new int[n];
		//getRandomArray(randomArray, n);
		
		int[] randomArray = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		System.out.println("Array before handle: ");
		showArray(randomArray);
		
		System.out.println("\nArray after handle: ");
		handleRandomArray(randomArray);
		showArray(randomArray);
		
	}
	
	public static void getRandomArray(int[] randomArray, int n) {
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			randomArray[i] = rd.nextInt(100);
		}
	}
	
	public static void handleRandomArray(int[] randomArray) {
		moveDisibleSevenNumber(randomArray);
		moveDisibleFiveNumber(randomArray);
	}
	
	public static void moveDisibleSevenNumber(int[] randomArray) {
		int n = randomArray.length;
		int index = 0;
		for (int i = 0; i < n - 1; i++) {
			if(randomArray[i] % 7 == 0 && randomArray[i] % 5 != 0) {
				int temp = randomArray[i];
				randomArray[i] = randomArray[index];
				randomArray[index] = temp;
				index++;
			}		
		}
	}
	
	public static void moveDisibleFiveNumber(int[] randomArray) {
		int n = randomArray.length;
		int index = 0;
		for (int i = n - 1; i > 0; i--) {
			if(randomArray[i] % 5 == 0 && randomArray[i] % 7 != 0) {
				int temp = randomArray[i];
				randomArray[i] = randomArray[n - 1 - index];
				randomArray[n - 1 - index] = temp;
				index++;
			}
		}
	}
	
	public static void showArray(int[] array) {
		for (int i : array) {
			System.out.print(i +" ");
		}
	}
}	

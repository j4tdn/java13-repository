package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("Nhap a");
		a = sc.nextInt();
		int binary[] = new int[100];
        int index = 0;
        while(a > 0){
            binary[index++] = a%2;
            a = a/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
	}
}

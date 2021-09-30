package Ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int h;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu cao : ");
		h = sc.nextInt();
		int x, output;
		
		for(int i = 1;i<= h; i++){
            for(int j = 0; j<= 2*h; j++){
                x = j-h;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;
 
                if(output > 0){
                    System.out.printf("%3d", output);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
 
        }
		
	}
	
}

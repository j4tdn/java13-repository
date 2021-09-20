import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nhap M: ");
		Integer m = sc.nextInt();
		
		System.out.print("nhap N: ");
		Integer n = sc.nextInt();
		
		Integer[][] A = new Integer [m][n];
		
		taobang(m,n,A);
		
		yenngua(m,n,A);
		
		
	}
	
	public static void taobang(Integer r, Integer c, Integer[][] A) {
		Random rd = new Random();
		
		for (int i =0; i<r ; i++) {
			for (int j =0; j<c ; j++) {
				A[i][j]= 1 + rd.nextInt(98);
			}
		}
		
		for (int i =0; i<r ; i++) {
			for (int j =0; j<c ; j++) {
				if (j == c-1 ) {
					System.out.println("|" + A[i][j] + "	"+ "|");
					System.out.println("=================================================");
				}else {System.out.print("|" + A[i][j] + "	");}
				
			}
		}
	}
	
	public static void yenngua(Integer r, Integer c,Integer[][] A) {

		int k=0;
		boolean n=true;
		for (int i =0; i<r; i++) {
			int min = A[i][0];
			n= true;
			for (int j =0; j<c; j++) {
				if (A[i][j] < min) {
					min = A[i][j];
					k = j;
				}
			}System.out.println("so be nhat hang thu " + i + " la "+ min);
			for (int t=0; t<r; t++) {
				if (A[t][k] > min) {
					System.out.println(min + " khong phai la lon nhat trong cot "+ k);
					System.out.println("=================================================");
					n=false;
					break;
				}
			}if (n) {
				System.out.println(min + " lon nhat trong cot "+ k);
				System.out.println("=================================================");
				System.out.println("thanh phan yen ngua la " + min + " tai vi tri " + i + ", " + k);
				break;
			}
			
		}if(!n){
			System.out.println("khong co thanh phan yen ngua");
		}
	}		
}

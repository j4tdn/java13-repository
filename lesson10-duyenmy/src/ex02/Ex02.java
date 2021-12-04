package ex02;

import java.util.Scanner;
import java.util.Vector;

public class Ex02 {
public static void main(String[] args) {
	int n, m=0;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào hàng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào cột của ma trận: ");
        n = scanner.nextInt();
    } while (n < 0||m<0);
         
    int[][] A = new int[m][n];
    System.out.println("Nhập vào các phần tử của ma trận A: ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
    
    System.out.println("Ma trận A: ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }
    int[][] kq=Matrix(A,m,n);
    System.out.println("Ma trận sau khi thay : ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(kq[i][j] + "\t");
        }
        System.out.println("\n");
    }
}
private static int[][] Matrix(int[][] origin,int m, int n){
	int[][] result = origin;
	int hang;
	int cot;
	Vector<Point> point = new Vector<Point>();
	for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if(origin[i][j]==0) {
            	Point a = new Point();
            	a.setI(i);
            	a.setJ(j);
            	point.add(a);
            }
        }
    }
	int size=point.size();
	for(int k=0;k<size;k++) {
		for(int j=0;j<n;j++) {
		result[point.elementAt(k).getI()][j]=0;
		}
		for(int i=0;i<m;i++) {
			result[i][point.elementAt(k).getJ()]=0;
			}
	}
	return result;
}

}

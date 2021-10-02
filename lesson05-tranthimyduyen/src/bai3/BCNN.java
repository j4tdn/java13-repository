package bai3;

import java.util.Scanner;

public class BCNN {
public static void main(String[] args) {
	int[] A = new int[1000];
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("\n\nNhap vao so phan tu: ");
    n = sc.nextInt();
    for(int i=0;i<n;i++){
    	System.out.println("\n\nNhap phan tu thu "+i+": ");
       A[i]= sc.nextInt();
        }
    System.out.println(BCNNOfM(A,n));
}
public static int UCLN(int a, int b){
   int m=0;
	
	if(a>b) 
        UCLN(a-b,b);
    else
        {if(a<b) {UCLN(a,b-a);}else m=a; }
return m;
}
public static int BCNN(int a, int b){
    return (a*b/UCLN(a,b) );
}

public static int BCNNOfM(int a[],int n){
        int temp = BCNN(a[0], a[1] );
        for(int i=2;i<n;i++){
            temp = BCNN(temp, a[i]);    
        }
        return temp;
    }
}


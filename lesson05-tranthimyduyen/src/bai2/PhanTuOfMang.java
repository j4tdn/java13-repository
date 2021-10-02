package bai2;

public class PhanTuOfMang {
public static void main(String[] args) {
	int n = 6;
	int[] A = {1,2,3,5,6};
	System.out.println(getMissingNumber(A,n));
}
public static int getMissingNumber(int[] A,int n) {
	int a = 0,counter=0;
	for(int i=1;i<=n;i++) {
		for(int j=0;j<=n-2;j++) {
			if(A[j]==i) {break;}
				if(j==(n-2)) { a= i;}
		
			}
	}
	return a;
		

}
}

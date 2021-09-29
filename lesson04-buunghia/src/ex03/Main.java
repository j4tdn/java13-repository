package ex03;

public class Main {
public static void main(String[] args) {
	System.out.print("Input n:");
	int n=ex01.Main.inputInt();
	for (int i=0;i<=n;i++) {
		for (int j=0;j<=i;j++) {
			System.out.print(String.format("%-5d",pascal(j,i)));
		}
		System.out.println("");
	}
}
public static int pascal(int k,int n) {
	if (k==0 || k==n) return 1;
	if (k==1) return n;
	return pascal(k-1,n-1) +pascal(k,n-1);
}
}

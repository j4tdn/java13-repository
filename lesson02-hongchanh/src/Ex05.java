
public class Ex05 {
public static void main(String[] args) {
	
	int i=0;
	int a=0;
	while(i <200) {
		a=a+1;
		if (check(a)) {
			i=i+1;
		}
	}
	System.out.println("so nguyen to thu 200 la: " + a );
}

private static boolean check(int a) {
	if (a==1) {return true;}
	for (int i=2; i<= a-1; i++) {
		if (a%i==0) {
			return false;
		}
	}
	return true;
			
}
}

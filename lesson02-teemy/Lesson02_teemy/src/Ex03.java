import java.util.Scanner;


public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String a = ip.nextLine();
		String a1 ="";
		for(int i=a.length()-1;i>=0;i--) {
			a1+=a.charAt(i);
		}
		if(a.equals(a1)) 
			System.out.println(a+" doi xung");
		else
			System.out.println(a+" khong doi xung");
	}
}

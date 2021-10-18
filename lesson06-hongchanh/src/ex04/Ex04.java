package ex04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		docso(2);
		docso(91);
		docso(235);
	}
	
	private static void docso (Integer a){
		if (a<10) {
			test1(a);
			System.out.println("");
		}
		if (a>=10 && a<100) {
			test1(a/10);
			System.out.print("muoi ");
			test3(a%10);
			System.out.println("");
		}
		if (a>=100) {
			test1(a/100);
			System.out.print("tram ");
			test2((a - (a/100*100))/10);
			System.out.print("muoi ");
			test3(a%10);
			System.out.println("");
		}
	}
	
	private static void test1(Integer a) {
		
		if (a==0) {
			System.out.print("khong ");	
		}
		
		if (a==1) {
			System.out.print("mot ");	
		}
		
		if (a==2) {
			System.out.print("hai ");	
		}
		
		if (a==3) {
			System.out.print("ba ");	
		}
		
		if (a==4) {
			System.out.print("bon ");	
		}
		
		if (a==5) {
			System.out.print("nam ");	
		}

		if (a==6) {
			System.out.print("sau ");	
		}
		
		if (a==7) {
			System.out.print("bay ");	
		}
		
		if (a==8) {
			System.out.print("tam ");	
		}
		
		if (a==9) {
			System.out.print("chin ");	
		}
	}
	
	private static void test2(Integer a) {
		
		if (a==0) {
			System.out.print("linh ");	
		}
		
		if (a==1) {
			System.out.print("mot ");	
		}
		
		if (a==2) {
			System.out.print("hai ");	
		}
		
		if (a==3) {
			System.out.print("ba ");	
		}
		
		if (a==4) {
			System.out.print("bon ");	
		}
		
		if (a==5) {
			System.out.print("nam ");	
		}

		if (a==6) {
			System.out.print("sau ");	
		}
		
		if (a==7) {
			System.out.print("bay ");	
		}
		
		if (a==8) {
			System.out.print("tam ");	
		}
		
		if (a==9) {
			System.out.print("chin ");	
		}
	}
	
	private static void test3(Integer a) {
		
		if (a==0) {
			System.out.print("muoi ");	
		}
		
		if (a==1) {
			System.out.print("mot ");	
		}
		
		if (a==2) {
			System.out.print("hai ");	
		}
		
		if (a==3) {
			System.out.print("ba ");	
		}
		
		if (a==4) {
			System.out.print("bon ");	
		}
		
		if (a==5) {
			System.out.print("lam ");	
		}

		if (a==6) {
			System.out.print("sau ");	
		}
		
		if (a==7) {
			System.out.print("bay ");	
		}
		
		if (a==8) {
			System.out.print("tam ");	
		}
		
		if (a==9) {
			System.out.print("chin ");	
		}
	}

}

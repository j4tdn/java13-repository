package ex03;

public class App {
	
	public static void main(String[] args) {
		printArr(4);
	}
	
	public static int[] tamgiac(int n) {
		
		int[] arr = new int[n+2];
		
		if(n == 0) {
			
			arr[0] = 1;
			arr[1] = 1;
				
		}
		else {
			for(int i=0; i<arr.length; i++) {
				if(i == 0 || i== arr.length -1) {
					arr[i] = 1;
				}
				else {
					int[] array = tamgiac(n-1);
					
					arr[i] = array[i] + array[i-1];
				}
				
			}
			
		}
		return arr ;
		
		
	}
	
	
	public static void printArr(int n) {
		for(int i=0;i <=n ; i++) {
			
			for(int a : tamgiac(i)) {
				System.out.print(a + "\t");
			}
		System.out.println();	
		}
		
	}

}



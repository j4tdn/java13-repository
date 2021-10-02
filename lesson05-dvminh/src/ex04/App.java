package ex04;

public class App {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21};
		int[] b = null;
		
		getUniqueNumbers(a, b);
	}
	
	private static void getUniqueNumbers(int[] a, int[] b) {
	    //int[] b = null; 
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for ( int j = 0; j < a.length; j++) {
				if(!isCheck(a, a[i])) {
					b[count] = a[i];
					count++;
				}
			}
		}
		Sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}
	}
	private static int[] Sort(int[] a) {
		int b;
	    for(int i = 0; i < a.length; i++){
	        for(int j = i + 1; j < a.length + 1; j++){
	            if(a[i] < a[j]){
	                b = a[i];
	                a[i] = a[j];
	                a[j] = b;        
	            }
	        }
	    }
	    return a;
	}
	
	private static boolean isCheck(int[] a, int b) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == b) return true; 
			}
		}
		return false;
    }	
	
}

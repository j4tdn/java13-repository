package data;

public class Ex01 {
	
	    

	    public static void main(String[] args) {
	    	int a;
		    int b;
	        a = 7;
	        b = 10;
	        S_Wap(a,b);
	        System.out.println("Gia Tri Cua a = " + a +" b = " + b) ;

	    }

	    private static void S_Wap(int x, int y){
	        int tem = x;
	        x = y;
	        y = tem;
	    }
	
}

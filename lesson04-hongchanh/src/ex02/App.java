package ex02;

public class App {
	public static void main(String[] args) {
		int[] array = sortArr(12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18);
		for(int a : array ) {
			System.out.print(a +"\t");
		}
	}
	
	
	public static int[] sortArr(int  ...arrs) {
		
		
		
		int temp = 0;
		int bay = 0;
		int nam = 0 ;
		
		for(int i=0; i<arrs.length-1;i ++) {
			
			if(arrs[i] % 7 == 0 && arrs[i] % 5 !=0 ) {
				bay++;
				temp=arrs[i];
				arrs[i]=arrs[bay -1];
				arrs[bay -1]= temp;
				}
			}
		for(int i=arrs.length-1; bay-1 <i;i --) {
			if(arrs[i] % 7 != 0 && arrs[i] % 5 ==0 ) {
				nam++;
				temp=arrs[i];
				arrs[i]=arrs[arrs.length - nam];
				arrs[arrs.length -nam]= temp;
				}
			}
		
		
		
		
		return arrs ;
		
	}
}

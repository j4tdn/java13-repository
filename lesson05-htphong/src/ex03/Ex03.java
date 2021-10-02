package ex03;

public class Ex03 {
	public static void main(String[] args) {
		int[] a = {2,3,4};
		System.out.println("BCNN: "+getLeastCommonMultiple(a));
	}
	public static int getLeastCommonMultiple(int a[]) {
		int k=0;
		int bcnn=1;
		int max=1;
		
		for(int i = 0;i<a.length;i++) {
			max*=a[i] ;
		}
		for(int i=1; i<max ;i++) {
			boolean check=false;
			for(int j=0;j<a.length;j++) {
				if(i%a[j]==0) check=true;
				else {
					check = false;
					break;
					
				}
			}
			if(check==true) {
				return i;
			}
		}
		return max;
	}
}

package ex04;

public class Ex04 {
	public static void main(String[] args) {
		int []a= {3,15,21,0,15,17,21};
		int []b=getUniqueNumbers(a, a.length);
		System.out.print(b[0]+"  ");
		for(int i=1;i<b.length;i++) {
			if(b[i]==0)
				break;
			System.out.print(b[i]+"  ");
		}
	}
	private static int[] getUniqueNumbers(int[] a,int n) {
		int[] b= new int[101];
		int max=a[0];
		for(int i=0;i<101;i++) {
			b[i]=0;
		}
		for(int i=0;i<n;i++) {
			b[a[i]]++;
			if(max<a[i]) {
				max=a[i];
			}
		}
		int [] c=new int[n];
		int j=0;
		for(int i=0;i<=max;i++) {
			if(b[i]==1) {
				c[j]=i;
				j++;
			}
		}
		return c;
	}
}

package ex04;

public class Ex04 {
	public static void main(String[] args) {
		int [] a = {3, 15, 21, 0, 15, 17, 21};
		int [] b = getUniqueNumbers(a);
		for(int i=0;i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
	public static int[] getUniqueNumbers(int[] a) {
		int [] b = new int[a.length];
		int k=0;
		for(int i=0; i<a.length;i++) {
			int p = a[i];
			int count=0;
			for(int j=0; j<a.length;j++) {
				if(a[i]==a[j]) count++;
			}
			if(count==1) {
				b[k] = a[i];
				k++;
			}
		}
		int [] c = new int[k];
		int l = 0;
		for(int i=0; i<c.length;i++) {
			c[i]=b[l];
			l++;
		}
		sort(c);
		return c;
	}
	
	public static void sort(int [] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}

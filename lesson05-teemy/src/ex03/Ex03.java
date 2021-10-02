package ex03;

public class Ex03 {
		public static void main(String[] args) {
			int n=3;
			int []a= {2,3,4};
			System.out.println(getLeastCommonMultiple(a, n));
		}
		private static int getLeastCommonMultiple(int[]a,int n) {
			int tam=a[0];
			for(int i=1;i<n;i++) {
				tam=getLeastCommon(tam, a[i]);
			}
			return tam;
		}
		private static int getLeastCommon(int x,int y) {
			int m=x;
			int n=y;
			while(m!=n) {
				if(m>n) {
					m=m-n;
				}else
					n=n-m;
			}
			return (x*y)/m;
		}

}

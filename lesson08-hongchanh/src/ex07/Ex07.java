package ex07;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaabaaabbaaaaa";
		String b = "aaabaaabbbbbbbbaaaaa";
		
		
		test(a);
		test(b);
	}


	private static void test(String s1) {
		
		String kq="";
		int max= 0;
		
		char[] a = s1.toCharArray();
		
		for (int i= 0; i< a.length-1; i++ ) {
			for (int t=i+1; t<a.length; t++) {
				if (a[i] == a[t]) {

					int dem = 0;
					String r ="";
					
					//System.out.println(a[i] + " : " + i);
					//System.out.println(a[t] + " : " + (t));
					//System.out.println("============");


					
					while (a[i] == a[t]) {
						
						
						//System.out.println(a[t] + " : " + t);


						r= r+a[i];
						t++;
						dem++;
						

						
						if(t== a.length) {
							break;
						}
					}
					//System.out.println(r);
					//System.out.println("do dai " + dem);

					//System.out.println("============");

					if (dem >= max) {
						max = dem;
						kq = r;
					}
				}
			}
		}
		System.out.println("chuoi can tim " + kq + " do dai " + max );
	}
}

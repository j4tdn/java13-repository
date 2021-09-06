import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] a=new int[5];
		int j,i=0 ;
		while (i<5) {
			a[i] = 20+rd.nextInt(10);
			j=0;
			while(j<i) {
				if(a[j]==a[i])
					break ;
				j++;
			}
			if (j==i)
				i++;
		}
		for(j=0;j<5;j++) {
			System.out.println(a[j]+" ");
		}
		
	}
	
}

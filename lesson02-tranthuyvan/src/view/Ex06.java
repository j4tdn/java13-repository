package view;

public class Ex06
{
	public static void main(String[] args) {
		 int count = 0, result = 2;
		 while(true) {
		     if(kiem_tra_so_ngto(result)) count++;
		     if(count == 199) break;
		     result++;
		 }
		 System.out.println(result);
	}
	
	public static boolean kiem_tra_so_ngto(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
           if (number % i == 0) {
               return false;
           }
        }
        return true;
	}
}


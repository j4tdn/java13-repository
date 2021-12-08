package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int matrix[][] = {{0,2,3,4}, {5,0,7,8}, {1,9,8,9}, {5,6,7,8}};
		
		show(matrix);
		findZero(matrix);
		show(matrix);
	}
	
	private static void findZero(int[][] matrix) {
		
		int tmp[][] = new int[4][4];
				tmp = coppy(matrix);

		for (int i=0; i<4 ; i++) {
			for (int t=0; t<4; t++) {
				if (tmp[i][t] ==0) {
					System.out.println( "vi tri cua 0 la " +i + " "+ t);
					ChangeToZero(matrix,i,t);
				}
			}
		}
	}
	
	private static int[][] coppy(int[][] matrix) {
		
		int tmp[][] = new int[4][4];
		
		for (int i=0; i<4 ; i++) {
			for (int t=0; t<4; t++) {
				tmp[i][t] = matrix[i][t];
			}
		}
		
		return tmp;
	}
		
	private static void ChangeToZero(int[][] result, int a, int b) {	
		for (int i=0; i<4 ; i++) {
			result[i][b] = 0;
		}
		
		for (int t=0; t<4 ; t++) {
			result[a][t] = 0;
		}
		
	}
	
	private static void show(int[][] matrix) {
		for (int i=0; i<4 ; i++) {
			
			for (int t=0; t<4; t++) {
				System.out.print(matrix[i][t] + " ");
			}
			System.out.println();
		}
	}
}

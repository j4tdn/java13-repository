package ex04;

public class App {
	public static void main(String[] args) {
		int[] input = {3,15,21,0,15,17,21};

		int[] output = getUniqueNumbers(input);
		
		for(int i = 0; i < output.length - 1; i++) {
			for(int j = i + 1; j < output.length; j++) {
				if (output[i] > output[j]) {
					int tmp = output[i];
					output[i] = output[j];
					output[j] = tmp;
				}
			}		
		}
		for(int i:output) {
			System.out.print(i + " ");
		}
		
	}

	public static int[] getUniqueNumbers(int input[]) {
		int[] output = new int[input.length];
		int x = 0;
		int count = 0;
		int number = 0;
		for(int i = 0;i<input.length;i++) {
			number = input[i];
			count = 0 ;
			for(int j = 0;j<input.length;j++) {
				if (number == input[j]) {
					count++;
				}
			}
			if(count == 1)  {
				output[x++] = input[i];
			}
		}

		return output;
	}

}

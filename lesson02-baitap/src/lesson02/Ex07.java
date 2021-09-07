package lesson02;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args){

        int[] nums = new int[5];

        Random random = new Random();

        for (int i = 0; i < nums.length; ++i){
            nums[i] = 20 + random.nextInt(11);
            System.out.print(nums[i] + " ");
        }
    }
}

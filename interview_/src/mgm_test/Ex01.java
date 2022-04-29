package mgm_test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number: ");
        int number = Integer.parseInt(sc.nextLine());
        if(number <= 0){
            throw new ArithmeticException("Numbers are positive non-zero integer");
        }
        System.out.println(isHappyNumber(number));
    }

    private static boolean isHappyNumber(int number) {
        Set<Integer> integers = new HashSet<>();
        int sum = 0;
        while(true) {
            while (number > 0) {
                sum += Math.pow(number % 10, 2);
                number = number / 10;
            }
            if (sum == 1) return true;
            if (integers.contains(sum)){
                return false;
            }
            integers.add(sum);
            number = sum;
            sum = 0;
        }
    }
}

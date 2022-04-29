package mgm_test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, Integer> point = new HashMap<>();
        System.out.print("Input number of judges (1<N<100): ");
        int nbrOfJudges = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<nbrOfJudges; i++){
            System.out.print("Input number of judge " + (i+1) + " 's choices: ");
            int nbrOfChoices = Integer.parseInt(sc.nextLine());
            for(int j = 0; j<nbrOfChoices; j++){
                int candidateID = Integer.parseInt(sc.nextLine());
                if(!point.containsKey(candidateID)){
                    point.put(candidateID, 3-j);
                }
                else{
                    point.put(candidateID, point.get(candidateID) + (3-j));
                }
            }
        }
        int value = Collections.max(point.values());
        System.out.println("Max point is: " + value);
        System.out.print("Winner candidate: ");
        point.entrySet().stream().filter(x->x.getValue() == value)
                .forEach(x-> System.out.print(x.getKey() + " "));
    }
}

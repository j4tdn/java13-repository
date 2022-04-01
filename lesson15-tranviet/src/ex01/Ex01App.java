package ex01;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Map;


public class Ex01App {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 2, 3, 4, 5, 3, 4, 5, 6, 8, 9};
//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//        Arrays.stream(numbers).boxed().filter(nbr -> Collections.frequency(list, nbr) == 1).forEach(x-> System.out.print(x + " "));

        Map<Integer, Long> map = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        findElements(map, x -> x.getValue() == 1, "Phan tu xuat hien 1 lan: ");
        findElements(map, x -> x.getValue() > 1, "Phan tu xuat hien nhieu hon 1 lan: ");//

    }

    private static void findElements(Map<Integer, Long> map, Predicate<Map.Entry<Integer, Long>> predicate, String str) {
        System.out.println(str);
        map.entrySet().stream().filter(predicate).forEach(x -> System.out.println(x.getKey() + " "));
    }
}

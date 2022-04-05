package stockmanagement.utils;

import java.util.List;
import java.util.Map;

public class PrintUtils {
    private PrintUtils(){

    }
    public static <K, V> void printMap(Map<K, V> map, String message) {
        System.out.println(message);
        map.forEach((K, V) -> System.out.println(K + " - " + V));
        System.out.println("\n=================================================\n");
    }

    public static <K> void printList(List<K> list, String message) {
        System.out.println(message);
        list.forEach(System.out::println);
        System.out.println("\n=================================================\n");
    }
}


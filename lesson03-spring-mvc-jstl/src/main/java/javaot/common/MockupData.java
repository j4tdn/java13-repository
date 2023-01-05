package javaot.common;

import javaot.bean.Children;

import java.util.Arrays;
import java.util.List;

public class MockupData {
    public static List<Children> getAllChildren(){
        return Arrays.asList(
                new Children(1, "NVA", 1988),
                new Children(2, "NVB", 1970),
                new Children(3, "NVC", 1992),
                new Children(4, "NVD", 1989)
        );
    }
}

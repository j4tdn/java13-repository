package javaot.common;

import javaot.bean.Child;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {
    public static List<Child> getAllChildren(){
        return new ArrayList<>(
                Arrays.asList(
                        new Child(1, "NVA", 1988),
                        new Child(2, "NVB", 1970),
                        new Child(3, "NVC", 1992),
                        new Child(4, "NVD", 1989)
                ));
    }

    public static String[] getAllCountries(){
        return new String[]{"VietNam", "America", "France", "China", "Indonesia"};
    }

    public static String[] getAllOperatingSystems(){
        return new String[]{"MacOS", "Linux", "Windows"};
    }

    public static String[] getAllFavoriteLanguages(){
        return new String[]{"Java", ".Net", "Python", "C++"};
    }
}

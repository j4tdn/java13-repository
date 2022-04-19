package data_structure;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        IList<String> students = mockData();
        students.sort(String::compareToIgnoreCase);
        students.print();
    }

    private static CustomList<String> mockData() {
        CustomList<String> students = new CustomList<>();
        students.add("Tran Viet");
        students.add("Pham Nguyen");
        students.add("Gia Bao");
        students.add("Hoang Thien");
        students.addAll(new String[]{"xyz", "abc", "123"});
        return students;
    }
}

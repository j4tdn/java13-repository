package demo;

import singleton.LazyInitializedSingleton;

import java.util.Calendar;
import java.util.Date;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        /**
         * Singleton Pattern
         */
        LazyInitializedSingleton.getInstance().doSth();

        Date date = Calendar.getInstance().getTime();
        System.out.println(date.toString());
    }
}


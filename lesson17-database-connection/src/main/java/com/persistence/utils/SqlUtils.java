package com.persistence.utils;

import java.io.Closeable;

public class SqlUtils {
    private SqlUtils(){

    }
    public static void close(AutoCloseable ... closeables){
        try{
            for(AutoCloseable closeable: closeables){
                closeable.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

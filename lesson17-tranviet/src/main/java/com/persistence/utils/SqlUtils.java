package com.persistence.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Objects;

public class SqlUtils {
    private SqlUtils() {

    }

    public static String encrypt(String text) {
        Objects.requireNonNull(text, "Encrypt text cannot be null!");
        return DigestUtils.md5Hex(text);
    }

    public static void close(AutoCloseable... closeables) {
        try {
            for (AutoCloseable closeable : closeables) {
                closeable.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

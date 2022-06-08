package com.persistence.view;

import org.apache.commons.codec.digest.DigestUtils;

public class EmployeeView {
    public static void main(String[] args) {
        String password = "hello123";
        String encryptedPassword = DigestUtils.md5Hex(password);
        System.out.println(encryptedPassword);
    }
}

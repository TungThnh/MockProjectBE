package vn.com.fsoft.TGDD.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptedPassword {
    // Encryte Password with BCryptPasswordEncoder
    public static String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

//    public static void main(String[] args) {
//        String rawPassword = "123456";
//        String encodedPassword = encrytePassword(rawPassword);
//        System.out.println(encodedPassword);
//    }
}

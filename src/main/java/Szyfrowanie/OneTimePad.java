package Szyfrowanie;

import java.util.Base64;


public class OneTimePad {
    private int positionOfLetter = 0;
    private String key;

    protected OneTimePad(String key) {
        this.key = key;
    }


    protected String encrypt(String message) {
        StringBuilder sb = new StringBuilder();
        int a, b, c = 0;
        for (int i = 0; i < message.length(); i++) {
            a = message.charAt(i);
            b = key.charAt(i);
            c = a ^ b;
            char d = (char) c;
            sb.append(d);
        }
        String encrypted = sb.toString();
        System.out.println(encrypted);
        return encrypted;
    }
//    TO:DO
    public String decrypt(String message, String key, int positionOfLetter) {
        String decrypted = "";
        return decrypted;
    }

    public static String toBase64(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    public static String fromBase64(String s) {
        return new String(Base64.getDecoder().decode(s));
    }
}




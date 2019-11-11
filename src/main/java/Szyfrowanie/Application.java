package Szyfrowanie;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put text to encrypt");
        String message = scanner.nextLine();
        System.out.println(message);
        OneTimePad oneTimePad = new OneTimePad("asdabshdasdkasndaksda");
        String encrypted = oneTimePad.encrypt(message);
//        String decrypted = oneTimePad.encrypt(encrypted);
//        System.out.println(decrypted);

    }
}
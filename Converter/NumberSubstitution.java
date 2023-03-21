package Converter;

import java.util.Scanner;

public class NumberSubstitution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pls first integer number: a ");
        int a = scanner.nextInt();

        System.out.println("Enter pls second integer number: b ");
        int b = scanner.nextInt();
        int c;

        System.out.println("a = " + a + " b = " + b);
        c = b;
        b = a;
        a = c;

        System.out.println("a = " + a + " b = " + b);
    }
}

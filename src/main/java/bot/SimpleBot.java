package main.java.bot;

import java.time.Year;
import java.util.Scanner;

public class SimpleBot {
    private static Scanner scanner = new Scanner(System.in);
    private final static String botName = "Aid";

    public static void main(String... args) {
        String name;

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + Year.now().getValue());
        System.out.println("Please, remind me your name.");
        name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int yourAge = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
    }

}


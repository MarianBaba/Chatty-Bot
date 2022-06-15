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

    }

}

package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select a drink (espresso, americano, cappuccino, water): ");
        String input = scanner.next();
        System.out.println("Please, wait...");

        System.out.println(getDrink1(input));
        System.out.println("_______________________");
        getDrink2(input);

    }

    public static String getDrink1(String input) {

       return switch (input) {
           case "espresso"   -> "Your espresso is ready. Have a nice day.";
           case "americano"  -> "Your americano is ready. Have a nice day.";
           case "cappuccino" -> "Your cappuccino is ready. Have a nice day.";
           case "water"      -> "Your water is ready. Have a nice day.";
           default           -> "Unfortunately, we don't have such a drink.";

        };

    }

    public static void getDrink2(String input) {

        if (input.equalsIgnoreCase("espresso"))
            System.out.println("Your espresso is ready. Have a nice day");
        else if (input.equalsIgnoreCase("americano"))
            System.out.println("Your americano is ready. Have a nice day");
        else if (input.equalsIgnoreCase("cappuccino"))
            System.out.println("Your cappuccino is ready. Have a nice day");
        else if (input.equalsIgnoreCase("water"))
            System.out.println("Your water is ready. Have a nice day");
        else
            System.out.println("Unfortunately, we don't have such a drink.");

    }
}

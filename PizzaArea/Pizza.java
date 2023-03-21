package PizzaArea;

public class Pizza {
    public static void main(String[] args) {

        double d = 4.2;

        PizzaCalculation pizzaArea = new PizzaCalculation(d);
        System.out.println(pizzaArea.pizzaArea(d));

    }

}


package PizzaArea;

public class PizzaCalculation {
    //S = d2 : 4 × π  площадь круга в зависимости от диаметра

    public PizzaCalculation(double input) {

        double resultArea = ((Math.pow(input, 2)) * Math.PI) / 4;

        printResultArea(resultArea);
    }

    private void printResultArea(double resultArea) {
        System.out.println("Pizza's area is " + resultArea + " square units");
    }


 // 2 variant

    public String pizzaArea(double input) {
         double pizzaArea = ((Math.pow(input, 2)) * Math.PI) / 4;
        String result = "Pizza's area is " + pizzaArea + " square units. Second method";

        return result;
    }

}

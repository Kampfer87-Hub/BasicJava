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

}
// сделал с  возвращаемым значением, но не могу понять как вывести результат на экран
// public class PizzaCalculation2 {
//    public double pizzaArea(double input) {
//
//        return ((Math.pow(input, 2)) * Math.PI) / 4;
//    }
//
//    public void printResultArea2(double pizzaArea) {
//        System.out.println("Pizza's area is " + pizzaArea + " square units");
//    }
//}
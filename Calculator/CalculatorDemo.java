package Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int a = 15;
        int b = 2;

        int operationResult = calculator.sum(a,b);
        System.out.println("Sum of our figures is " + operationResult);

        operationResult= calculator.minus(a,b);
        System.out.println("Subtraction of our figures is " + operationResult);

        operationResult = calculator.multiplication(a,b);
        System.out.println("Multiplication of our figures is " + operationResult);

        double operationResultDouble = calculator.div(a,b);
        System.out.println("Division of our figures is " + operationResultDouble);


    }
}
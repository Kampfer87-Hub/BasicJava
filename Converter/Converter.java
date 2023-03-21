package Converter;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Converter converter = new Converter();
        System.out.println("Enter please value in degrees Celsius :");
        double degreesCelsius = scanner.nextDouble();
        converter.celsiusToKelvin(degreesCelsius);
        converter.celsiusToFahrenheit(degreesCelsius);

    }

    public void celsiusToKelvin(double input){
    double result = input + 273.15;
        System.out.println(input + "°C equals " + result +"°K");
    }

    public void celsiusToFahrenheit(double input){
        double result = (input * 9 / 5) + 32;
        System.out.println(input + "°C equals " + result +"°F");
    }


}

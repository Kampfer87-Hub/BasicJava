package population;

import java.util.Scanner;

public class CityPopulation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please, enter country id (0-Germany / 1-France): ");
        int index = console.nextInt();

        System.out.print("Please, enter the population of the city: ");
        int population = console.nextInt();

        System.out.println(getForGermany(index, population));
        System.out.println(getForFrance(index, population));
    }


    public static String getForGermany(int index, int population) {
        String result = "";
        if (index == 0 && population < 100000 && population > 0)
            result = "It's a small town in Germany";
        else if (index == 0 && population < 400000 && population > 100000)
            result = "It's an average town in Germany";
        else if (index == 0 && population > 1000000)
            result = "It's a big city in Germany";
        else if (index ==0)
            result = "these conditions were not provided for in the conditions of the task";

        return result;

    }
    public static String getForFrance(int index, int population) {
        String result = "";
        if (index == 1 && population < 200000 && population > 0)
            result = "It's a small town in France";
        else if (index == 1 && population < 500000 && population > 200000)
            result = "It's an average town in France";
        else if (index == 1 && population > 1500000)
            result = "It's a big city in France";
        else if (index == 1)
            result = "these conditions were not provided for in the conditions of the task";

        return result;

    }
}


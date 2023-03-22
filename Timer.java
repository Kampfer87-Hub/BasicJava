package timer;

import java.util.Random;

public class Timer {
    public static void main(String[] args) {
        Random random = new Random();
        int seconds = random.nextInt(0, 28800);

        System.out.println("до конца рабочего дня осталось " + seconds + " секунд");
        System.out.println(hour(seconds));
    }

    public static String hour(int input) {
        String result;

        if ((input / 3600) >= 5) {
            result = "до конца рабочего дня осталось " + (input / 3600) + " часов";
        } else if (((input / 3600) < 5) && ((input / 3600) > 1)) {
            result = "до конца рабочего дня осталось " + (input / 3600) + " часа";
        } else {
            result = "до конца рабочего дня осталось менее часа";
        }

        return result;

    }
}

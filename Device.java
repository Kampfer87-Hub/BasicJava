package device;

import java.util.Random;

public class Device {
    public static void main(String[] args) {

        Random random = new Random();
        int Temperature1 = random.nextInt(80, 300);
        int Temperature2 = random.nextInt(-25, 150);

        boolean isDeviceWorking;

        if (Temperature1 > 100 && Temperature2 < 100)
            isDeviceWorking = true;
        else
            isDeviceWorking = false;

        if (isDeviceWorking)
            System.out.println("Устройство работает нормально");
        else
            System.out.println("Ошибка. Проверьте температуру в колбах");
    }
}

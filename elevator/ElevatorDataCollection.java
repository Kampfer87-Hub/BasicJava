package elevator;

import java.util.Scanner;

public class ElevatorDataCollection {
    public static void captureData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify the number of floors in the building: ");
        int H = scanner.nextInt();

        System.out.print("How many floors does the elevator go up : ");
        int N = scanner.nextInt();

        System.out.print("How many floors did the elevator go down: ");
        int M = scanner.nextInt();


        int sum = 0;
        int count = 0;
        while (sum < H) {
            if (N > M) {
                sum = sum + N - M;
            } else {
                System.out.println("Elevator can't move up");
                break;
            }
         
            count++;
        }

        System.out.println("to go up to the " + H + "th floor, you have to do " + count + " climbs");

        scanner.close();
    }
}

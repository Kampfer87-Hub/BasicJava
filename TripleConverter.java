import java.util.Scanner;

public class TripleConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a integer number (2 value): ");
        int a = console.nextInt();

        int a31 = a / 3;
        int a31_ = a % 3;

        int a32 = a31 / 3;
        int a32_ = a31 % 3;

        int a33 = a32 / 3;
        int a33_ = a32 % 3;

        System.out.println(a31_ + "" + a32_ + "" + a33_);




        console.close();


           }
}

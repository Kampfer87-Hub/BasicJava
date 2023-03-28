package randomIntGenerator;

public class IntegerGenerator {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 900 + 100);
        System.out.println("случайно сгенерированное трёхзначное целое число - " + x);


        switchCompare(x);

    }

    public static void switchCompare(int x) {
        int hundred = x / 100;
        int ten = (x / 10) % 10;
        int unit = x % 10;

        if ((hundred >= ten) && (hundred > unit))
            System.out.println("наибольшая цифра в нём - " + hundred);


        if ((ten > hundred) && (ten >= unit))
            System.out.println("наибольшая цифра в нём - " + ten);


        if ((unit >= hundred) && (unit > ten))
            System.out.println("наибольшая цифра в нём - " + unit);


    }
    }


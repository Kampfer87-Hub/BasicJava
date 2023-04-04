package array15;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("массив из 15 случайных целых чисел : " + Arrays.toString(array));
        System.out.println("----------------------------------------");
        System.out.println("в данном массиве чётных элементов : " + getEvenElement(array));

    }

    public static int getEvenElement(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                count++;
            }
        }
        return count;
    }
}


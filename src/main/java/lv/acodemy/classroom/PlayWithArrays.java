package lv.acodemy.classroom;

import java.util.Arrays;

public class PlayWithArrays {
    public static void main(String[] args) {

        //Arrays

        //Empty array with integer data type

        int[] numbers;

        //Creating an Array
        numbers = new int[10];

        // int[] numbers = new int[10]
        System.out.println(Arrays.toString(numbers));

        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        //[0, 2, 0, 4, 0, 6, 0, 8, 0, 10]

        numbers[1] = 2;
        numbers[3] = 4;
        numbers[5] = 6;
        numbers[7] = 8;
        numbers[9] = 10;

        System.out.println(Arrays.toString(numbers));

        //Create int array with numbers

        int[] evenNumbers = {2, 4, 6, 8, 10, 12};
        System.out.println(Arrays.toString(evenNumbers));

        // Create String array with name

        String[] names = {"John", "Michel", "Anna", "Mery"};
        //Print all names (separatly)
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        String[] fruit = {"apple", "pear", "melon", "peach", "watermelon"};
        //Print all names (separatly)
        System.out.println(fruit[0]);
        System.out.println(fruit[1]);
        System.out.println(fruit[2]);
        System.out.println(fruit[3]);
        System.out.println(fruit[4]);


    }
}

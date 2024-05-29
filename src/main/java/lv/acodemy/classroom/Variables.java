package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {

        /*
        Multi-line comment
        */

        //Category : Integral

        //byte:

        byte smallNumber = 120;
        // RGB ( Red Green Blue)
        byte red = 120;
        byte green = 45;
        byte blue = 127;
        System.out.println(blue);

        // int (Integer)
        // Employee ID:
        int employeeID = 123456;

        //Population count:
        int populationOfLatvia = 1811956;
        System.out.println(populationOfLatvia);

        // shor
        // Game Score:
        short playerScore = 15000;

        // Year of birth
        short yearOfBirth = 1900;

        // char (Character)
        // Grade:
        char grade = 'A';

        //Initials:
        char firstInitial = 'S';
        char lastInitial = 'F';

        // Long
        // Bank Account Balance:
        long accountBalance = 10000000000L;
        System.out.println(accountBalance);


        // Java 7
        //Improves readability
        long population = 1_000_000_000L; // 1 billion;

        // Avoiding mistake
        int creditCardNumber = 1234_5678;

        // double (PI)
        // PI
        double piValue = Math.PI;
        System.out.println(piValue);


        // Another way
        double pi = 3.14_15_92;

        // Floating number:
        // Float:
        // Price:
        float price = 1_234_567_8998.98F;

        // Double
        // Financial Debt:
        double financialDebt = 23_456_789_123.45555;

        // Distance
        double distanceToSun = 149_540_870_3; // in km;


        // Boolean
        // has or is prefix:

        boolean isSummer = false;
        boolean hasSon = false;

        boolean hasBMW = true;

        // String (we can save here any text in double quotes)

        String firstName = "Sveta";
        String lastName = "Filonova";

        //var
        var myCurrentAge = 29;
        var myFullName = "Sveta Filonova";

        // Operators:
        // * - multiplication (8*9)
        // / - division (8/2)
        // + - Addition (5+5)
        // - - Subtraction (10-4)
        // -- (-1)
        // ++ (+1)
        // % (the remainder after dividing a by b)

        boolean evenNumber = 4 % 2 == 0; // true
        boolean oddNumber = 4 % 3 == 0; //false

        int remainderResult = 5 % 3;
        System.out.println(remainderResult);
        

    }
}

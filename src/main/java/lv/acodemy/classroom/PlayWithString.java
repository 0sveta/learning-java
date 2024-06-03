package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {
        String name = "Sveta";
        String surName = "Filonova";

        //My name is : Svetlana Filonova
        // Concatination

        String myText = "My name is : " + name + " " + surName;
        System.out.println(myText);

        System.out.println("My name is : " + name + " " + surName);

        // Interpolation
        // %s - for text
        // %d - for numeric value

        String interpolation = String.format("My name is: %s %s", name, surName);

        String.format("My name is: %s %s", name, surName);
        System.out.println(interpolation);
        System.out.println(String.format("My name is: %s %s", name, surName));


        String firstName = "John";
        String lastName = "Doe";
        int age = 25;
        String city = "New York";

        System.out.println(firstName + " " + lastName);

        System.out.println(firstName + " " + lastName + " is " + age + " year old and live in " + city);


        String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));


    }
}

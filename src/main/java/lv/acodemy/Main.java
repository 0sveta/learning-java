package lv.acodemy;

import lv.acodemy.classroom.Car;
import lv.acodemy.classroom.Cat;

public class Main {
    public static void main(String[] args) {

        //How to create object ?

        Car myFirstCar = new Car();

        //How to print object ?
        System.out.println(myFirstCar);

        // Set car brand
        myFirstCar.setCarBrand("Audi");
        System.out.println(myFirstCar);

        //set all other fields
        myFirstCar.setModel("A4");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(6);
        myFirstCar.setColor("Race blue");
        System.out.println(myFirstCar);


        // Task : Create a new object car, set all fields and print object out;

        Car mySecondCar = new Car();
        ;

        mySecondCar.setCarBrand("Lexus");
        mySecondCar.setModel("L123");
        mySecondCar.setProductionYear(2020);
        mySecondCar.setMileage(10012);
        mySecondCar.setColor("Black");
        System.out.println(mySecondCar);

        Car myBmwCar = new Car("BMW", "X5", 2020, 130_000, "black");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder()
                .setCarBrand("Skoda")
                .setModel("Octavia")
                .setProductionYear(2022)
                .setMileage(6)
                .setColor("Green")
                .build();

        mySkoda.start();
        mySkoda.start();
        mySkoda.drive(1_000);
        mySkoda.drive(2_500);


        Cat myCat = new Cat("Barsik", "Male", 3, "Ginger");
        System.out.println(myCat);

        myCat.eat();
        myCat.voice();
        myCat.sleep();
        myCat.walk();
    }

}







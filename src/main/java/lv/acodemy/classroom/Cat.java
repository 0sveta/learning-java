package lv.acodemy.classroom;

public class Cat {
    // Cat fields

    private String name;
    private String gender;
    private int age;
    private String breed;
    private boolean isSleeping = false;

    // Cat constructor

    public Cat(String name, String gender, int age, String breed) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.breed = breed;
    }

    public Cat() {
    }

    // Cat getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Om-nom-nom!");
    }

    public void sleep() {
        if (isSleeping) {
            System.out.println("Z-z-z-z");
        } else {
            System.out.println("I am not sleeping");
        }
    }

    public void walk() {
        if (!isSleeping) {
            isSleeping = true;
            System.out.println("I am walking....");
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}





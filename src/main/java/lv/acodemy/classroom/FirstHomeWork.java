package lv.acodemy.classroom;

public class FirstHomeWork {
    public static void main(String[] args) {

        //Easy peasy: Write a Java program that checks if a given number is positive. If it is, print "Positive number."

        int i = 2;
        if (i >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }


        //Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."

        int y = 6;
        if (y % 2 == 0) {
            System.out.println("Even number");
        }

        //Age group classifier: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."

        int[] Age = {2, 15, 18, 19, 21, 42};

        for (int group : Age) {
            if (group <= 18) {
                System.out.printf("Persone is Teenager \n", Age);
            } else if (group >= 19) {
                System.out.printf("Person is Adult\n", Age);
            }
        }

        //Leap year checker: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."

        int z = 2024;
        if (z % 4 == 0 && z % 100 != 0 && z % 400 != 0) {
            System.out.println("Leap year.");
        }

        //Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."

        int x = 18;
        if (x >= 0 && x % 2 == 0 && x < 100) {
            System.out.println("Valid number.");
        }

        //Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."
        int c = 18;
        if (c >= 0 && c % 2 == 0) {
            System.out.println("Positive and Even.");
        }

        //Character type identifier: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel.");


        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height)

        double weight = 60.5;
        double height = 1.05;
        double bodyMassIndex;

        bodyMassIndex = weight / (height * height);
        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Normal");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }


        //Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average. Assign a final grade based on the following criteria:
        //If the average score is 90 or above, assign a grade of "A."
        //If the average score is between 80 and 89, assign a grade of "B."
        //If the average score is between 70 and 79, assign a grade of "C."
        //If the average score is between 60 and 69, assign a grade of "D."
        //If the average score is below 60, assign a grade of "F."

        int Math = 92;
        int Science = 51;
        int English = 92;
        double finalGrade;
        finalGrade = (Math + Science + English) / 3;
        if (finalGrade >= 90) {
            System.out.println("Your final grade is" + " " + "A");
        } else if (finalGrade >= 80 && finalGrade < 89) {
            System.out.println("Your final grade is" + " " + "B");
        } else if (finalGrade >= 70 && finalGrade < 79) {
            System.out.println("Your final grade is" + " " + "C");
        } else if (finalGrade >= 60 && finalGrade < 69) {
            System.out.println("Your final grade is" + " " + "D");
        } else if (finalGrade < 60) {
            System.out.println("F");
        }

        //File extension checker: Write a Java program that takes a filename as input and checks if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf". If the file has a valid extension, print "Valid file extension," otherwise print "Invalid file extension."
        String file = "kdfdfhdghdg.pdf";
        if (file.endsWith(".txt") || file.endsWith(".pdf") || file.endsWith(".doc")) {
            System.out.println("Valid file extension");

        }
    }
}

package org.example;

public class Student {

    double grade[] = {18.5, 16.0, 19.2, 15.7, 18.5};
    String student[] = {"Ana", "Luis", "Maria", "Pedro", "Sofia"};

    public static void main(String[] args) {

        Student obj = new Student();

        double temp;
        String temp1;
        int passes = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Student: " + obj.student[i]);
            System.out.println("Grade: " + obj.grade[i]);
        }

        for (int i = 0; i < 4; i++) {

            passes++;

            for (int j = i + 1; j < 5; j++) {

                if (obj.grade[i] < obj.grade[j]) {

                    temp = obj.grade[i];
                    obj.grade[i] = obj.grade[j];
                    obj.grade[j] = temp;

                    temp1 = obj.student[i];
                    obj.student[i] = obj.student[j];
                    obj.student[j] = temp1;
                }
            }
        }

        System.out.println("\nTotal passes: " + passes);

        System.out.println("\nTOP 3 STUDENTS");

        for (int i = 0; i < 3; i++) {

            System.out.println((i + 1) + ". "
                    + obj.student[i] + " - "
                    + obj.grade[i]);
        }
    }
}
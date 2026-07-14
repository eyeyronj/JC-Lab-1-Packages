package org.example.main;
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {

        //init and declaration of objects
        ClassOne class1 = new ClassOne();
        ClassTwo class2 = new ClassTwo();
        ClassThree class3 = new ClassThree();

        // greet of different classes
        System.out.println(class1.greet());
        System.out.println(class2.greet());
        System.out.println(class3.greet());

    }
}
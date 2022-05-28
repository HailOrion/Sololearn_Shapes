package org.example;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape {
    public Square() {
    }

    public Square(int width) {
        this.width = width;
    }

    @Override
    void area() {
        int areaOfSquare = width*width;
        System.out.println(areaOfSquare);
    }
}

class Circle extends Shape {

    public Circle(int width) {
        this.width = width;
    }

    @Override
    void area() {
        double areaOfCircle = Math.PI*width*width;
        System.out.println(areaOfCircle);
    }
}

class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
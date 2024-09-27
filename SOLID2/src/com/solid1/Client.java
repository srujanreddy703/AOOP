package com.solid1;

public class Client {
  public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }

}


package com.mycompany.learningjava;

public class Part1 {
    public static double pi = 3.14159;
    public static double radius = 2;
    public static double width = 5.3;
    public static double height = 8.6;
    
    public static void main(String[] args) {
    //Assignment 1.8
    System.out.println("For a circle: ");
    perimeterOfCircle(pi, radius);
    areaOfCircle(pi, radius);
    System.out.println( );
    //Assignment 1.9
    System.out.println("For a rectangle: ");
    perimeterOfRectangle(width, height);
    areaOfRectangle(width, height);
    //Assignment 1.10
    
    
    }
    public static void perimeterOfCircle(double pi, double radius) {
        System.out.println("The perimeter is: "); 
        System.out.println(2 * radius * pi);
    }
    public static void areaOfCircle(double pi, double radius) {
        System.out.println("The area is: ");
        System.out.println(radius * radius * pi);
    }
    public static void perimeterOfRectangle(double width, double height) {
        System.out.println("The perimeter is: "); 
        System.out.println(2 * (width + height));
    }
    public static void areaOfRectangle(double width, double height) {
        System.out.println("The area is: ");
        System.out.println(width * height);
    }
    
    
}

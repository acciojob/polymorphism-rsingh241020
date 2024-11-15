package com.driver;

public class Main {
    // Task 1: Create a class Product inside Main class
    public static class Product {

        // Task 3: Create a method with the following definition
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with the following definition
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create another overloaded method with the following definition
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in the main function called p
        Product p = new Product();

        // Calling each overloaded method and printing the result
        System.out.println(p.product(4,6));       // Calls product(int, int)
        System.out.println(p.product(3, 2, 3));    // Calls product(int, int, int)
        System.out.println(p.product(2.3, 3.2));   // Calls product(double, double)
    }
}
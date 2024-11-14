package com.driver;

public class Main {
    public class Product { // Capitalize class name to match naming conventions

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Product p = main.new Product(); // Correct way to instantiate inner class

        System.out.println(p.product(4, 4));
        System.out.println(p.product(3, 2, 3));
        System.out.println(p.product(2.3, 3.2));
    }
}

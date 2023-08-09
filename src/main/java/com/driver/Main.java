package com.driver;
public class Product {
	public int product(int x, int y) {
		return x+y;
	}
	public int product(int x, int y, int z) {
		return x+y+z;
	}
	public double product(double x, double y) {
		return x+y;
	}
}
public class Main {
	Product p = new Product();

    int result1 = p.product(5, 3);
    System.out.println("Product of 5 and 3: " + result1);

    int result2 = p.product(2, 4, 6);
    System.out.println("Product of 2, 4, and 6: " + result2);

    double result3 = p.product(2.5, 3.5);
    System.out.println("Product of 2.5 and 3.5: " + result3);
}
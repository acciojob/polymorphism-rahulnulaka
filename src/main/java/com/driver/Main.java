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
	Product p=new Product();
	double a=p.product(10.0,5.0);
}
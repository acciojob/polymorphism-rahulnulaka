package com.driver;

public class Main {
	public static class Product {
		public int product(int x, int y) {
			return x*y;
		}
		public int product(int x, int y, int z) {
			return x*y*z;
		}
		public double product(double x, double y) {
			return x*y;
		}
	}
	public static void main(String[] args){
	Product p = new Product();

    p.product(5, 3);

    p.product(2, 4, 6);
    

    p.product(2.5, 3.5);
    
}
}
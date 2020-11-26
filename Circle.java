package com.buzzfreeze.Homework;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public static void main(String[] args) {
		Circle A = new Circle();
		A.getArea();
	}

	public Circle() {}
	public Circle(double r) {}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
}

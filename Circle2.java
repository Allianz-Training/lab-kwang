package com.buzzfreeze.Homework;

public class Circle2 {
	private double radius = 1.0;
	
	public static void main(String[] args) {
		Circle2 A = new Circle2();
		A.getArea();
	}

	public Circle2() {}
	public Circle2(double radius) {}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {}
	public double getArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	public double getCircumference() {
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		return "cicle[radius="+radius;
	}
	
}

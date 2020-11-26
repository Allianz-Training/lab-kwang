package com.buzzfreeze.Homework;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	
	public Rectangle() {}
	public Rectangle (float length,float width) {
		this.length = length;
		this.width = width;
		}
	public float getLength() {
		return length;
	}
	public void setlength(float length) {}
	public float getwidth() {
		return width;
	}
	public void setwidth(float width) {}
	public double getArea() {
		double Area = width*length;
		return Area;
	}
	public double getPerimeter() {
		double perimeter = (length+width)*2;
		return perimeter;
	}
	@Override
	public String toString() {
		return "Rectangle [length="+length+",width"+width+"]";
	}
	
}

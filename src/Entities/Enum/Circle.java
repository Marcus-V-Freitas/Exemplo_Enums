package Entities.Enum;

import Entities.Shape;

public class Circle extends Shape{
	
	private Double radius;
		
	
	public Circle() {}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {

		return Math.PI*getRadius()*getRadius();
	}

	@Override
	public String toString() {
		return "Circle:" +String.format("%.2f",area())+"\n";
	}
	
	
	
}

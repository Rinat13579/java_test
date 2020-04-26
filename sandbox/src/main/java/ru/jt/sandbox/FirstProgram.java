package ru.jt.sandbox;

public class FirstProgram {
	public static void main (String[] args) {

		hello("World");
		hello("User");
		hello("Name");

		Square s = new Square(5);
		System.out.println("Square area with side " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4,6);
		System.out.println("Square area with sides " + r.a +" and " + r.b + " = " + area(r));
	}

	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (Square s){
		return s.l * s.l;
	}

	public static double area (Rectangle r){
		return r.a * r.b;
	}
}

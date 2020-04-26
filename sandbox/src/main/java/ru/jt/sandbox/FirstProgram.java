package ru.jt.sandbox;

public class FirstProgram {
	public static void main (String[] args) {

		hello("World");
		hello("User");
		hello("Name");

		Square s = new Square(5);
		System.out.println("Square area with side " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Square area with sides " + r.a +" and " + r.b + " = " + r.area());
	}

	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

}

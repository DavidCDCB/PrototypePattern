package Prototype;

import Prototype.Shapes.Circle;

public class App {
	public static void main(String[] args) throws Exception {
		Circle circle = new Circle();

        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("Red");

		Circle anotherCircle = (Circle) circle.clone();

		System.out.println("Original:");
		circle.view();
		System.out.println("\nClon:");
		anotherCircle.view();
        
	}
}

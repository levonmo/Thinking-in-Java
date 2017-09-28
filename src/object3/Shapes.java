package object3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shapes {
	public static void main(String[] args) {
		List<Shape> list = Arrays.asList(new Circle(), new Square(),new Tringle());
		for (Shape s : list) {
			s.draw();
		}
		// 参加一个Rhomboid，并向上转型
		/*
		 * Shape rhomboid = new Rhomboid(); if(rhomboid instanceof Rhomboid) {
		 * Rhomboid circle = (Rhomboid) rhomboid; circle.draw(); } if(rhomboid
		 * instanceof Circle) { Circle circle = (Circle)rhomboid; circle.draw();
		 * } System.out.println("end");
		 */
	}
}
abstract class Shape {
	void draw() {System.out.println(this + ".draw");}
	abstract public String toString();
}
class Circle extends Shape {
	public String toString() {return "Circle";}
}
class Square extends Shape {
	public String toString() {return "Square";}
}
class Tringle extends Shape {
	public String toString() {return "Tringle";}
}
class Rhomboid extends Shape {
	public String toString() {return "Rhomboid";}
}

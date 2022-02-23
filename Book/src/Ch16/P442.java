package Ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

abstract class Shape implements Comparable<Shape>{
	
	int x, y;
	
	Shape(){
		this(0, 0);
	}
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract double area();
	abstract double length();
	
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
	
	@Override
	public int compareTo(Shape s) {
		return (int)(this.area() - s.area());
	}
}

class Rectangle extends Shape{
	
	int w, h;

	Rectangle(){
		this(1, 1);
	}
	
	Rectangle(int w, int h){
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		return w*h;
	}

	@Override
	double length() {
		return (w+h)*2;
	}

	@Override
	public String toString() {
		return "넓이 : "+this.area();
	}
}

class Circle extends Shape{
	
	double r;
	
	Circle(){
		this(1);
	}
	Circle(double r){
		this.r =r;
	}
	@Override
	double area() {
		return (r * r) * Math.PI;
	}
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	@Override
	public String toString() {
		return "넓이 : "+this.area();
	}
	
}

public class P442 {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		System.out.println("오름차순 정렬");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("내림차순 정렬1");
		list.stream().sorted((a,b) -> b.compareTo(a)-a.compareTo(b)).forEach(System.out::println);
		
		System.out.println("내림차순 정렬2");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}

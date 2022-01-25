package Ch13;


import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	
	int x, y;
	
	Shape(){
		this(0, 0);
	}
	Shape(int x, int y ){
		this.x = x;
		this.y = y;
	}
	abstract double area();
	abstract double length();
	
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Circle extends Shape{

	double r;
	
	Circle(){
		this(1);
	}
	
	Circle(double r){
		this.r = r;
	}
	
	@Override
	double area() {
		return (r * r) * Math.PI;
	}

	@Override
	double length() {
		return (r * 2) * Math.PI;
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
		return (w * h);
	}

	@Override
	double length() {
		return (w + h) * 2;
	}
}

public class P351 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Circle(3.0));
		list.add(new Rectangle(3, 4));
		list.add(new Circle(5));
		list.add(new Rectangle(5, 6));
		
		System.out.println("전체 도형의 면적의 합 : " + getArea(list));
		System.out.println("전체 도형의 둘레의 합 : " + getlength(list));
				
	}
		
	private static double getlength(List list) {
		double value = 0;
		
		for(int i=0;i<list.size();i++) {
			Shape s = (Shape)list.get(i);
			value += s.length();
		}
		return value;
	}
	private static double getArea(List list) {
		double value = 0;
		
		for(int i=0;i<list.size();i++) {
			value += ((Shape)list.get(i)).area();
		}
		return value;
	}
	
}

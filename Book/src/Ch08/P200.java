package Ch08;

public class P200 {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();
	}
}

class Parent{
	
	int number = 3;
	
	Parent(){
		System.out.println("何葛 按眉 积己");
	}
}

class Child extends Parent{
	
	int number = 2;
	
	Child(){
		System.out.println("磊侥 按眉 积己");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
		
	}
}

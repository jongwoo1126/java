package Ch08;

public class P201 {

	public static void main(String[] args) {
		
		Child2 child2 = new Child2();
		child2.print();
	}
}

class Parent2{
	
	int number = 3;
	
	Parent2(){
		System.out.println("何葛 按眉 积己");
	}
}

class Child2 extends Parent2{
	
	// int number = 2;
	
	Child2(){
		System.out.println("磊侥 按眉 积己");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
		
	}
}

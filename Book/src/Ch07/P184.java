package Ch07;

public class P184 {

	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.print();
	}
	
	public void print() {
		System.out.println("����� ClassP184");
	}
	
}

class ClassB{
	void print() {
		System.out.println("����� ClassB");
	}
}

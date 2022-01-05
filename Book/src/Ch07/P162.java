package Ch07;

public class P162 {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		
		System.out.println(op.multiply(4,3));
	}
}

class Operator{

	int multiply(int x, int y) {
	return x * y;
	}
}
		
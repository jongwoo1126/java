package Ch09;

class AAA implements AA{

	@Override
	public void a() {

		
	}

	@Override
	public void aa() {
	
		
	}
	
}

class ABB implements AB{

	@Override
	public void a() {
		
		
	}

	@Override
	public void ab() {
		
		
	}
	
}

public class P243 {

	public static void main(String[] args) {
		
		A a = new AAA();
		
		AA aa = new AAA();
		AAA aaa = new AAA();
		
		A b = new ABB();
		AB ab = new ABB();
		ABB abb = new ABB();
		
		System.out.println("a > A : "+(a instanceof A));
		System.out.println("aa > A : "+(a instanceof A));
		System.out.println("aaa > A : "+(a instanceof A));
	
		System.out.println("aaa > AB : "+(aaa instanceof AB));
	}
}

package Ch08;

class Aclass{
	protected String varA;
	String varA2;
	
	protected void methodA() {
		System.out.println("methodA");
	}
	protected void methodA2() {
		System.out.println("methodA2");
	}

}

public class P214 {

	public static void main(String[] args) {
		
		Aclass ac = new Aclass();
		ac.varA = "varA";
		ac.varA2 = "varA2";
		ac.methodA();
		ac.methodA2();
	}
}

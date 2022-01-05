package Ch08;

import Ch08.Aclass;

class Bclass{
	
	public void methodB() {
		Aclass ac = new Aclass();
		ac.varA = "varA";
		ac.varA2 = "varA2";
		ac.methodA();
		ac.methodA2();
	}
}


public class P215 extends Aclass{

	P215(){
		this.varA = "varA";
		this.varA2 = "varA2";
		this.methodA();
		this.methodA2();
	}
	
}

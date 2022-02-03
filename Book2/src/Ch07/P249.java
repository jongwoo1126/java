package Ch07;

class D{
	int m;
	void work() {
		System.out.println(m);
	}
}

class E{
	int m;
	void work() {
		System.out.println(m);
	}	
}

class F{
	int m;
	void work() {
		System.out.println(m);
	}
	F(int a){
		m = a;
	}
}

public class P249 {

	public static void main(String[] args) {
		
		D d = new D();
		E e = new E();
		F f = new F(3);
		
		d.work();
		e.work();
		f.work();
	}
}

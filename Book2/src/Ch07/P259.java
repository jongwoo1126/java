package Ch07;

class M{
	int m1, m2, m3, m4;
	M(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	M(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	M(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

class N{
	int m1, m2, m3, m4;
	N(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	N(int a){
		this();
		m1 =a;
	}
	
	N(int a, int b){
		this(a);
		m2 = b;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

public class P259 {

	public static void main(String[] args) {
		
		M m1 = new M();
		M m2 = new M(10);
		M m3 = new M(10, 20);
		m1.print();
		m2.print();
		m3.print();
		System.out.println();
		
		N n1 = new N();
		N n2 = new N(10);
		N n3 = new N(10, 20);
		n1.print();
		n2.print();
		n3.print();
		
	}
}

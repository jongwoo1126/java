package Ch07;

class Y{
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}

class Z{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class P255 {

	public static void main(String[] args) {
		
		Y y = new Y();
		y.init(2, 3);
		System.out.println(y.m);
		System.out.println(y.n);
		
		Z z = new Z();
		z.init(2, 3);
		System.out.println(z.m);
		System.out.println(z.n);
	}
}

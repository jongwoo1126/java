package Ch07;

class AA {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	void work() {
		this.init(2, 3);
	}
}

public class P253 {

	public static void main(String[] args) {
		
		AA aa = new AA();
		aa.work();
		System.out.println(aa.m);
		System.out.println(aa.n);
	}
}

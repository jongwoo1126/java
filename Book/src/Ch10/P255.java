package Ch10;

public class P255 {

	int i = 10;
	
	void outerMethod() {
		class Inner{
			int x = 20;
			int i = 30;
			void innerMethod() {
				System.out.println(x);
				System.out.println(i);
				System.out.println(this.i);
				System.out.println(P255.this.i);
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		P255 lic = new P255();
		lic.outerMethod();
	}
}

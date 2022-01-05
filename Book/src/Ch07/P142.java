package Ch07;

public class P142 {

	public static void main(String[] args) {
		
		P142 m = new P142();
		P142 m2 = new P142();
		
		if(m == m2) {
			System.out.println("m개체와 m2객체는 같다.");
		}else {
			System.out.println("m개체와 m2객체는 같지않다.");
		}
	}
}

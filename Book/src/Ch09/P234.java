package Ch09;

public class P234 {
	
	public static void main(String[] args) {
		
		P233 com = new P233();
		System.out.println(P233.INK);
		System.out.println(P233.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
	}
}

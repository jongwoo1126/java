package Ch07;

public class P174 {

	public static void main(String[] args) {
		
		P173 c1 = new P173();
		P173 c2 = new P173("중형차");
		P173 c3 = new P173("현대", "대형차");
		P173 c4 = new P173("black", "기아", "화물차");
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);
	}
}

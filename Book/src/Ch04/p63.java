package Ch04;

public class p63 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// & 연산
		System.out.println( a==b & test());
		
		// && 연산
		System.out.println(a==b && test());
	}
	
	public static boolean test() {
		System.out.println("test() 메서드 실행됨");
		return true;
	}
}

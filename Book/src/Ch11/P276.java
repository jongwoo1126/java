package Ch11;

public class P276 {

	public static void main(String[] args) throws Exception{
		try {
			first();
		}catch(Exception e) {
			System.out.println("main() ���� ó��");
			System.out.println(e.getMessage());
			throw e;
		}
	}
	static void first() throws Exception{
		try {
			second();
		}catch(Exception e) {
			System.out.println("first() ���� ó��");
			throw e;
		}
		
	}
	static void second() throws Exception{
		try {
			throw new Exception("���� �߻�");
		}catch(Exception e) {
			System.out.println("second() ���� ó��");
			throw e;
		}
		
	}
}

package Ch05;

public class Increment {
	
	public int num1;
	public static int num2;
	
	public Increment() {
		
		num1++;
		num2++;
		
		System.out.println("Increment num1 : "+num1);
		System.out.println("Increment num2 : "+num2);
	}
	
	// �����޼��忡���� non-static ������ ������ �� ����.
	public static void add() {
		num1++;
		num2++;
	}

}
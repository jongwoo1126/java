package Ch15;

public class P406 {
	
	public static void main(String[] args) {
		
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("�� �̸��� "+name+"�Դϴ�.");
		};
		
		li3.print("ȫ�浿");
	}
}

@FunctionalInterface
interface LambdaInterface3{
	void print(String name);
}

package Ch15;

public class P403 {
	
	public static void main(String[] args) {
		
		LambdaInterface li = () -> {
			String str = "�޼��� ���";
			System.out.println(str);
		};
		li.print();
	}
}

interface LambdaInterface{
	void print();
}

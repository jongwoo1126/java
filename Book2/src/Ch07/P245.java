package Ch07;

public class P245 {

	public static void main(String[] args) {
		method1(1, 2);
		method1(1, 2, 3);
		method1();
		
		method2("�ȳ�", "�氡");
		method2("��ť", "����", "����");
		method2();
	}
	
	public static void method1(int...values) {
		System.out.println("�迭�� ���� : " + values.length);
		for(int k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	public static void method2(String...values) {
		System.out.println("�迭�� ���� : " + values.length);
		for(String k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}

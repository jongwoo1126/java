package Ch08;
/*
 * �¥ : 2022/01/10
 * �̸� : ������
 * ���� : �ڹ� ����ó�� �ǽ��ϱ� ���� p264
 */
public class Sub1_ExceptionTest {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 2;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			// ������ �߻��� ���ɼ��� �ִ� �ڵ���� �ۼ�
			 r4 = num2 / num1;
		}catch (Exception e) {
			// ������ �߻������� ó�� ���� �ۼ�
			e.printStackTrace();
		}finally {
			// �����߻� ���ο� ������� ������ ������ ����Ǵ� ó����
			System.out.println("����ó�� �Ϸ�...");
		}
		
		System.out.println("r1 : "+ r1);
		System.out.println("r2 : "+ r2);
		System.out.println("r3 : "+ r3);
		System.out.println("r4 : "+ r4);
		
		System.out.println("���α׷� ����...");
		
	}
}

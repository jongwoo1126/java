package Ch05;
/*
 * ��¥ : 2022/01/04
 * �̸� : ������
 * ���� : do~while��
 */
public class p94 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		}while(i <= 100);
		
		System.out.println("�հ� : "+sum);
	}
}

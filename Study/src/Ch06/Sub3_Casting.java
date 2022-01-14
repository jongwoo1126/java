package Ch06;
/*
 * ��¥ : 2022/01/05
 * �̸� : ������
 * ���� : �ڹ� ĳ���� �ǽ��ϱ� ���� p205
 */
public class Sub3_Casting {

	public static void main(String[] args) {
		
		// ĳ����(����ȯ)
		int    num1 = 1;
		double num2 = num1;
		int    num3 = (int)num2;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
		// �� ĳ����
		Animal a1 = new Eagle();
		Animal a2 = new Lion();
		Animal a3 = new Shark();
		
		// �ٿ� ĳ����
		Eagle eagle = (Eagle) a1;
		Lion lion = (Lion) a2;
		Shark shark = (Shark) a3;
		
		eagle.hunt();
		lion.hunt();
		shark.hunt();
	}
}
package Ch07;

public class P176 {

	// static ����
	static int sVar;
	
	// static �޼���
	static void sMethod() {
		
	}
	
	// �ν��Ͻ� ����
	int var;
	
	// �ν��Ͻ� �޼���
	void method() {
		
	}
	
	// static �ʱ�ȭ ��
	static {
		sVar = 0;
		sMethod();
		
		//����(�ν��Ͻ� ����, �޼��� ��� �Ұ�)
		//var = 0;
		//method();
	}
	
	// static �޼���
	static void sMethod2() {
		//����(static �޼��忡�� this Ű���� ���Ұ�
		//this.sVar = 0
		//this.sMethod();
	}
}

package Ch08;

public class P222 {

	// ������ ������ �޼���
	void method() {
		
	}
	
	// �����ǰ� �Ұ����� �޼���
	final void finalMethod() {
		
	}
}

class SubFinalMethod extends P222{
	
	void method() { //������ ����
		System.out.println("method() ������");
	}
	
	void FinalMethod() { // ������ �Ұ�
		System.out.println("finalMethod() ������");
	}
}

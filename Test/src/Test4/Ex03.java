package Test4;

public class Ex03 {

	public static void main(String[] args) {
		
		String fileName = "�ڹ� ������.hwp";
		
		int idx = fileName.lastIndexOf(".");
					
		String title = fileName.substring(0, idx);
		String ext   = fileName.substring(idx+1);
		
		System.out.println("���ϸ� : "+title);
		System.out.println("Ȯ���� : "+ext);
		
	}
}

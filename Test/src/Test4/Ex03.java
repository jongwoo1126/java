package Test4;

public class Ex03 {

	public static void main(String[] args) {
		
		String fileName = "자바 수행평가.hwp";
		
		int idx = fileName.lastIndexOf(".");
					
		String title = fileName.substring(0, idx);
		String ext   = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
	}
}

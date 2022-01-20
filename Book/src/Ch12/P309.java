package Ch12;

public class P309 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		String str = "";
		for(int i=0 ; i<1000000 ; i++) {
			str += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : "+ (end - start)/1000);
	}
}

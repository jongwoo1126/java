package Ch06;

public class P125 {

	public static void main(String[] args) {
		
		// 원본배열
		int[] arrInt = {1, 2, 3};
		
		// 복사할 배열 
		int[] arrInt2 = new int[5];
		
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		
		// 배열값 출력
		for(int i=0 ; i<arrInt2.length ; i++) {
			System.out.println(arrInt2[i]);
		}
		
	}
}

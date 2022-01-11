package Ch06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P126 {

	public static void main(String[] args) {
		
		// 원본배열
		int[] arrInt = {1, 2, 3};
		
		// 복사할배열
		int [] arrInt2 = null;
		arrInt2 =Arrays.copyOf(arrInt, 5);
		
		// 배열값 출력
		for (int i=0 ; i<arrInt2.length ; i++) {
			System.out.println(arrInt2[i]);
		}
		
	}
}

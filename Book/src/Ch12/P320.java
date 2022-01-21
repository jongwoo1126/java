package Ch12;

import java.util.Random;

public class P320 {

	public static void main(String[] args) {
		
		Random rand =new Random();
		
		for (int i=0;i<5;i++) {
			System.out.println(rand.nextInt(6)+1);
		}
	}
}

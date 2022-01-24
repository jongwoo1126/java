package Ch12;

import java.text.DecimalFormat;

public class P332 {

	public static void main(String[] args) {
		
		double[] scores = {90.555, 80.6666, 70.77777, 60.666666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(df.format(scores[i]));
		}
	}
}

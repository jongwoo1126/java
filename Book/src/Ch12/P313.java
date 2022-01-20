package Ch12;

public class P313 {
	
	public static void main(String[] args) {
		
		double v1 = Math.PI * 1000;
		double v2 = Math.round(v1);
		double v3 = v2 / 1000.0;
		System.out.println(v3);
		
		System.out.println(Math.round(Math.PI*1000)/1000.0);
	}
}

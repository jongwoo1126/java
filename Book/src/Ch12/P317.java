package Ch12;

public class P317 {

	public static void main(String[] args) {
		
		int i = 10;
		 Integer intg = (Integer)i;
		 
		 Long lng = 10L;
		 int i2 = intg + 10;
		 long l = intg + lng;
		 
		 System.out.println("i2 = "+i2);
		 System.out.println("l = "+l);
		 
		 Integer intg2 = new Integer(30);
		 int i3 = (int)intg2;
		 System.out.println("i3 = "+i3);
	}
}

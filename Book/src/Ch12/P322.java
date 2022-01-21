package Ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P322 {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}
}

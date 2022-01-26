package Ch13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P375 {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
		int[] nums = {1234, 4567, 2350, 9870, 2345};
		
		for(int i=0;i<names.length;i++) {
			map.put(names[i], nums[i]);
		}
		
		Collection values = map.values();
		
		for(Object i : values) {
			System.out.println(i);
		}
		
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

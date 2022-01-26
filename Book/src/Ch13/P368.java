package Ch13;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class P368 {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		for (int i=1;i<=5;i++) {
			v.add(i);
		}
		
		Enumeration e =v.elements();
		System.out.println("Enumeration ���");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator it = v.iterator();
		System.out.println("Iterator ���");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

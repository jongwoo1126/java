package Ch12;

public class P288 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1.hashcode() : "+str1.hashCode());
		System.out.println("str2.hashcode() : "+str2.hashCode());
		System.out.println("System.identityHashCode(str1) : "+System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2) : "+System.identityHashCode(str2));
	}
	
}

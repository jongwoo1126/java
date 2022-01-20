package Ch12;

public class P302 {

	public static void main(String[] args) {
		
		String str = "Hello My Name in Hong Gil Dong";
		
		System.out.println(str.charAt(6));
		System.out.println(str.equals("Hello My Name is Hong Gil Dong"));
		System.out.println(str.indexOf("Hong"));
		System.out.println(str.indexOf('H'));
		System.out.println(str.substring(17));
		System.out.println(str.substring(6, 13));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("Dong"));
		System.out.println(str.replace("Hong", "Kim"));
		System.out.println(str.replaceAll("Name", "NickName"));
		System.out.println(str.toString());
		
		str = " 	�ȳ� �ϼ���, 	�ݰ����ϴ�.	";
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		str = String.valueOf(10);
		str = String.valueOf(10.5);
		
		str = "ȫ�浿, �̼���, ������, ���߱�";
		String[] arr = str.split(",");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(i+"�� �ε��� �� = "+arr[i]);
		}
				
				
	}
	
}

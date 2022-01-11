package Ch10;

public class P260 {

	public static void main(String[] args) {
		
		P259 out = new P259();
		
		out.setInterfaceEx(new P260_InterfaceExample1());
		out.outerMethod();
		out.setInterfaceEx(new P260_InterfaceExample2());
		out.outerMethod();
	}
}

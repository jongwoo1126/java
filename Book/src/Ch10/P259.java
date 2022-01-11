package Ch10;

public class P259 {

	interface InterfaceEx{
		void method();
	}
	
	InterfaceEx ie;
	
	void setInterfaceEx(InterfaceEx ie) {
		this.ie = ie;
	}
	void outerMethod() {
		ie.method();
	}
}

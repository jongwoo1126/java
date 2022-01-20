package Ch12;

public class P294 {
	
	public static void main(String[] args) {
		
		for(String var : System.getenv().keySet()) {
			System.out.println(var + "=" + System.getenv(var));
		}
	}
}

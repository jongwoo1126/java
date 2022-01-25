package Ch13;

public class P360 {

		String name;
		int age;
		
		P360 (String name, int age){
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "(" + name + "," + age + ")";
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof P360) {
				P360 m = (P360)obj;
				return this.name.equals(m.name) && this.age == m.age;
			}else {
				return false;
			}
		
		}
		
		@Override
		public int hashCode() {
			return this.name.hashCode() + age;
		}
	
}

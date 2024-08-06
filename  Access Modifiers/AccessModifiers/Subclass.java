package AccessModifiers;

public class Subclass extends Demo1 {
	 public void name() {
		 callprivatemethod();
		 dispalyvalues();
		 
		
	}

	     public static void main(String[] args) {
			Subclass subclass = new Subclass();
			subclass.name();
		}
}

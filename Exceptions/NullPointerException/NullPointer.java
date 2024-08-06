package NullPointerException;

public class NullPointer {
	
	public static void main(String[] args) {
		 try {
		String name = null;
		int length = name.length();
		System.out.println(" Length of the string: " + length);
	}
		 catch (NullPointerException e) {
			  System.out.println("NullPointerException caught: " + e.getMessage());
			     
		}
		 catch (Exception e) {
			   System.out.println("An unexpected exception occurred: " + e.getMessage());
			    	}

	}
}

package String;

public class matchesString {
	public static void main(String[] args) {
		String name = "rahul";
		String regex= "rahul";
		boolean isMatch = name.matches(regex);

        if (isMatch) {
            System.out.println("The name is valid.");
        } else {
            System.out.println("The name is not valid.");
        }
    }

		
	}



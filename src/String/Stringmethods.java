package String;

public class Stringmethods {
	public static void main(String[] args) {
		
	String name = "Rahul";
	String name1 = "rahul, kumar";
	String name2 = "Rahul";
	if (name.equalsIgnoreCase(name1)) {
		System.out.println(" both are same name :"+ name +"  : "+ name1);
	} else {
		System.out.println(" both are not same  name :"+ name +"  : "+ name1);
		
	}
	System.out.println(" startwith letter : "+name1.startsWith("rahul"));
	System.out.println(" endwith letter : "+name1.endsWith("kumar"));
	System.out.println(" endwith letter : "+name1.endsWith("kumar"));
	int result1 = name.compareTo("compare name : "+name2);
    System.out.println(result1);
}

}

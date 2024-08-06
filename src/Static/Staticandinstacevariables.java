package Static;

public class Staticandinstacevariables {
 Integer Id= 12;
 String name = "rahul";
 Double fee= 24223.00;
 static String collagename="Cits";
 static String collageaddress="warangal";
 
 public static void main(String[] args) {
	 Staticandinstacevariables staticinstace= new Staticandinstacevariables();
	 System.out.println(" Student ID :"+staticinstace.Id);
	 System.out.println(" Student name :"+staticinstace.name);
	 System.out.println(" Studentd fee :"+staticinstace.fee);
     System.out.println(" collagename :"+collagename);
     System.out.println(" collageAddress : :"+collageaddress);
}
}

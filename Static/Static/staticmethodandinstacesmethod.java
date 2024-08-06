package Static;

public class staticmethodandinstacesmethod {
	Integer Id= 12;
	 String name = "rahul";
	 Double fee= 24223.00;
	 static String collagename="Cits";
	 static String collageaddress="warangal";
	  public static void  staticmetho() {
		
		     System.out.println(" collagename :"+collagename);
		     System.out.println(" collageAddress : :"+collageaddress);
		
	}
	  
	  public void instancesmethod() {
		  Staticandinstacevariables staticinstace= new Staticandinstacevariables();
			 System.out.println(" Student ID :"+staticinstace.Id);
			 System.out.println(" Student name :"+staticinstace.name);
			 System.out.println(" Studentd fee :"+staticinstace.fee);
		  
		
	}
	  public static void main(String[] args) {
		  staticmetho();
		  System.out.println("=========");
		  staticmethodandinstacesmethod staticinstaces= new staticmethodandinstacesmethod();
		  staticinstaces.instancesmethod();
		
	}
}

package Abstractprograms;



public  class subclass  extends demo{

	@Override
	public void Collage() {
		System.out.println("chaitanya institute of technology and science ");
		
	}
	public void instances() {
		
		name();
		study();
		Collage();
			
			
		
	}
	
public static void main(String[] args) {
	subclass subclass =new subclass();
	subclass.name();
	subclass.study();
	subclass.Collage();
	System.out.println("====");
	subclass.instances();
}
}

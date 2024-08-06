package Arrays;
public class calculateAverage {
	 public static Double avarage(int[]avg) {
		 int sum=0;
		for (int i : avg) {
			sum = sum+i;
			
		}
		 double avarage =(double)sum/avg.length;
		return avarage;
			 
			
		}
	 public static void main(String[] args) {
		 int numbers[]={10,20,30,40,50};
		 Double avarage = avarage(numbers);
		 System.out.println(" the array list avarage  : "+avarage);
	}
		 
		
	}



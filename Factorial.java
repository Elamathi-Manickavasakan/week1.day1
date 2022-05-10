package week1.day1;

public class Factorial {
	
	//Find the Factorial of a given number
	
	public static void main(String[] args) {
		
		int x = 5, fact = 1;
		
		for	( int e = 1; e <= x; e++) {
			
			fact = fact* e;
		}
		
         System.out.println(fact);
	}

}

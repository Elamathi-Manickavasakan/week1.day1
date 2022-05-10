package week1.day1;

public class PrimeNumber {
	
	//To find whether a number is a Prime number or not
	
	public static void main(String[] args) {
     
	int x = 13;
	
	boolean flag = false;
	
	for(int i = 2; i<= x/2; i++) {
		
	
		if (x%i==0)
		
		{flag=true;
		
		break;
		
		}
	    
	    }
	
			
	if(!flag)
		System.out.println("Prime");

	else
		System.out.println("Prime");;

}

}

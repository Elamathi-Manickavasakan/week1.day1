package week1.day1;

public class FibinocciSeries {
	
	public static void main(String[] args) {
		
	//To find Fibinocci Series for a given range
	
	
		int x = 8, firstNumber = 0, secondNumber = 1, sum;
        
		for (int e = 1; e <=x; e++) {
			
			System.out.println(firstNumber);
            
			sum = firstNumber + secondNumber;
			
			firstNumber = secondNumber;
			
			secondNumber = sum;
			
			
		}
	
	}

}

package java_Practice;

public class tryCatchdemo {
	
	static void ageLimit(int age) {
		
		
			if(age<18) {
				throw new ArithmeticException("invalid age");
			}
			
			else {
				System.out.println("Welcome to vote");
			}
		}
		
		


	public static void main(String[] args) {
		// TODO Auto-generated method
		
		
		ageLimit(12);
		

	}

}

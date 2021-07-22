package java_Practice;

public class Duplicate_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {13,12,12,12};
		int counter=0;
		int duplicateno= a[0];



		for(int i=1;i<a.length;i++) {
			
			if(duplicateno!=a[i]) {
				System.out.println("list is having no duplicate number");

                 
			}
			
			while(i<a.length && a[i]==a[i+1]){
				
					counter++;
			        i++;
					
				System.out.println(counter);	
				}
				
				
				
			}
			
			
			
            


		}
		
		


	}










package java_Practice;

public class String_char_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="gajanan";	
		//int count = 0;
		char str = 0;
		
		for(int i=0;i<=s1.length()-1;i++) {
			
			int count = 0;
			 //str=s1.charAt(i);			 
			 
		for(int j=i;j<=s1.length()-1;j++)	
			
		{
			//str=s1.charAt(i);	
			// matched=s1.charAt(j);
			if(s1.charAt(i)==s1.charAt(j)) {
				
				count=count+1;
				System.out.print(s1.charAt(i));
					
				
			}			
						
		}
		
		System.out.println(count);
									
	}
		

}
}

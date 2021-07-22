package java_Practice;

public class stringindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="vinay";
		
		
		for(int i=0;i<=str.length()-1;i++) {
			int count = 0;
			
			for(int j=i;j<=str.length()-1;j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					count=count+1;
					
					
				}
				System.out.println(count);
				
			}
		}
		
	
}

}


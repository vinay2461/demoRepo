package java_Practice;

public class globantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="welcome globant";
		
		for(int i=0;i<=str.length()-1;i++) {
			
			//System.out.println(str.charAt(i));
			
			if(str.charAt(i)!=' ') {
				for(int j=str.length()-1;j>=0;j--) {
					
					System.out.println(str.charAt(j));
					System.out.println(str.charAt(j));
				}
			}
		}

	}

}

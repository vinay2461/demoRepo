package java_Practice;

public class index_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,12,13,9,8};
		int b[]= {20,12,13,34,8};
		int count=0;

		for(int i=0;i<=a.length-1;i++) {

			for(int j=i;j<=b.length-1;j++) {
				if(a[i]==b[j]) {

					System.out.println("index at" +i);
					count++;
					                   
				}
				
			}
			if(count==1) {
				break;
			}
  
		}
		
	}

	}

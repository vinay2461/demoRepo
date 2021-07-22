package java_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2= new ArrayList<Integer>();
		Integer[] arr = new Integer[ar1.size()];
				
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		
		System.out.println(ar1);
		
		//ArrayList<Integer> ar2=ar1;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter value");
		
		int indexValue=sc.nextInt();
		
		for(int i=indexValue;i<=ar1.size()-1;i++) {
			
			for(int j=0;j<=ar2.size()-1;j++)
			
			//ar1.get(i);
			   ar1.get(i);
			
			
			
			
		}
		
	  
		

	}

}

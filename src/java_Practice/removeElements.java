package java_Practice;

import java.util.Scanner;

final class removeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[] {10,20,30,40,50};

		int b[]= new int[a.length];
		
		int c[]= new int[a.length];

		Scanner sc =new Scanner(System.in);

		System.out.println("enter value");

		int indexValue=sc.nextInt();

		for(int i =indexValue;i<=a.length-1;i++) {

			b[i]=a[i];
			
			System.out.println(b[i]);
			
			

		}
		
		for(int i=0;i<=indexValue;i++) {
			
			b[i]=a[i];
		}
		
		for(int i=0;i<=b.length-1;i++) {
			System.out.println(b[i]);
		}
		
}
	
}

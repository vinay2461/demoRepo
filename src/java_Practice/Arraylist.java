package java_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1=new ArrayList();
		for(int i=0;i<=10;i++) {
			a1.add(i);
			
		}
		
		Iterator i1=a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			
			
		}

	}

}

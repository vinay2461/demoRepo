package java_Practice;

public class Vinay12 {

	
	public void myBuf (StringBuffer s, StringBuffer s1) {
        s.append ("B");
        s = s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Vinay12 t = new Vinay12();
        StringBuffer s = new StringBuffer ("A");
        StringBuffer sl = new StringBuffer ("B");
        t.myBuf(s, sl);
        System.out.print(s);
		
	

		
		
	}

}

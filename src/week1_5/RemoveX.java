package week1_5;

public class RemoveX {
	
	public static String removeX(String str) {
		 String s1 = str;
		 int n = str.length();
	     char[] s = str.toCharArray();
	     if (s[0]=='x'| s[0]=='X') {
	    	s1 = str.substring(1);
	     }
	     if (s[n-1]=='x' | s[n-1]=='X') {
	    	 s1 = s1.substring(0, n-2);
	     }
	     return s1;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeX(args[0]));
	}

}

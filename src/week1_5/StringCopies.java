package week1_5;

public class StringCopies {
	
    public static String repeatFirstTwoChars(String str) {
    	int n = str.length();
    	String s = str.substring(0,2),s1="";
    	for(int i=0; i<n;i++) {
    		s1+=s;
    	}
        return s1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(repeatFirstTwoChars(args[0]));
	}

}

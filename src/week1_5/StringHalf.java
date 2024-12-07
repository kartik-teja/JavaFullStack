package week1_5;

public class StringHalf {
    public static String getFirstHalf(String str) {
    	int n= str.length();
        if (n%2==0) {
        	return str.substring(0,n/2);
        }
        else {
        	return null;
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFirstHalf(args[0]));

	}

}

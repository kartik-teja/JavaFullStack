package week1_5;

public class ShortLongShort {
	public static String shortLongShort(String a, String b) {
        int n=a.length(),m=b.length();
        if(n>m) {
        	return b+a+b;
        }
        else {
        	return a+b+a;
        }
    }


	public static void main(String[] args) {
		System.out.println(shortLongShort(args[0],args[1]));

	}

}


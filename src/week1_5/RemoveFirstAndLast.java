package week1_5;

public class RemoveFirstAndLast {
	
    public static String removeFirstAndLast(String str) {
       return str.substring(1,str.length()-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeFirstAndLast(args[0]));
	}

}

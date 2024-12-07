 package week1_5;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String s) {
		int size = s.length();
		char[] word = s.toCharArray();
	    for(int i = 0; i<size/2;i++) {
	    	if (word[i] != word[size-i-1]) {
	    		return false;
	    	}
	    }
	    return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isPalindrome("hel0leh") ){
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
	}

}

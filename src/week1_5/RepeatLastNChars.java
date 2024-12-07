package week1_5;

public class RepeatLastNChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String word = args[0];
			int n = Integer.parseInt(args[1]);
			if(n>word.length()) {
				System.out.println("The number exceeds the length of the word");
			}else {
				for(int i=0;i<n;i++) {
					System.out.print(word.substring(word.length()-n));
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Please enter the correct values");
		}
	}

}

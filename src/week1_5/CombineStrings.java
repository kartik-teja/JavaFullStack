package week1_5;

public class CombineStrings {
	
	public static String combineStrings(String a, String b) {
		String combined = "";
		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();
		int str1Length = a.length();
		int str2Length = b.length();
		for(int i=0;i<Math.min(str1Length,str2Length);i++) {
			combined+=str1[i];
			combined+=str2[i];
		}
		if(str1Length<str2Length) {
			for(int i=str1Length;i<str2Length;i++) {
				combined+=str2[i];
			}
		}else {
			if(str1Length>str2Length){
				for(int i=str2Length;i<str1Length;i++) {
					combined+=str1[i];
				}
			}
		}
		
		return combined; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combineStrings("Hello","World"));
	}

}

package CrackingCodingInterview;

public class StringUniqueChar {

	public static void main(String[] args) {
		String string1 = "qwerty";
		String string2 = "qweq";
		boolean result = isUnique(string1);
		
		if(result == true) {
			System.out.println("String  has unique characters");
		}else
		System.out.println("String  doesnt have unique characters");
		
	}
	
	 private static boolean isUnique(String str) {
			if(str.length()> 128) return false;
			boolean[] charSet = new boolean[128];
			for(int i=0;i<str.length();i++) {
				int val =str.charAt(i);
				System.out.println("val "+ val);
				if(charSet[val]) {
					return false;
				}
				charSet[val]=true;
			}
			return true;
	 }

}

package CrackingCodingInterview;

import java.util.Arrays;

public class StringPermutationCheck {

	public static void main(String[] args) {
		String s1= "asdfg";
		String s2="gfsqa";
		
		boolean result  = permutations(s1,s2);
		if(result==true) {
			System.out.println("String are in permutations");
		}else
			System.out.println("String are not in permutations");
		}
	
	public static boolean permutations(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
	}
		int[] letters = new int[128];
		char[] arr = s1.toCharArray();
		System.out.println(Arrays.toString(arr));
		for(char c: arr) {
			letters[c]++;
			
		}
		System.out.println(Arrays.toString(letters));
		
		for(int i=0;i<s2.length();i++) {
			int c=(int) s2.charAt(i);
			letters[c]--;
			if(letters[c]< 0) {
				return false;
			}
		}
		return true;
		
}
}

package CrackingCodingInterview;

public class ReverseString {

	public static void main(String[] args) {
		
		String s ="AkshayKarai";
		String result = reverseString(s);
		System.out.println(result);
	}
	
	public static String reverseString(String s) {
		String str =s;
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		return sb.reverse().toString();
		
	}

}

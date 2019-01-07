package CrackingCodingInterview;

public class StringRotation {

	public static void main(String[] args) {
		String s1 ="qwerty";
		String s2 ="ytrewq";
		
		boolean result = isCheck(s1,s2);
		if(result == true) {
			System.out.println("String s1 is rotation of s2 ");
		}else
		System.out.println("String s1 is not rotation of s2  ");
	}
	
	public static boolean isCheck(String s1, String s2) {
		
	if(s1.length()!=s2.length()) {
		return false;
	}
	
	StringBuffer sb= new StringBuffer();
	sb.append(s1);
	String newS1 = sb.reverse().toString();
	System.out.println("String  "+ newS1);
	System.out.println("String  "+ s2);
	
	if(!newS1.equals(s2)) { 
	return false;
	}else {
	return true;
	}	
	}

}


public class StringRev {

	public static void main(String[] args) {
		stringReverse("Hello");
	}
	
	public static String stringReverse(String s) {
		String result = "";
		char[] charList = new char[s.length()];
		
		for(int i = 0; i<(s.length()/2)-1;i++) {
			char temp = s.charAt((-1-i));
			charList[-1-i] = s.charAt(i);
		}
		String ss = charList.toString();
		System.out.println("CharList: "+ String.copyValueOf(charList));
		return result;
	}
	
}

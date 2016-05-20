
public class frontBack {
	//Given a string, return a new string where the first and last chars have been exchanged.
	public String frontBack(String str) {
		if(str.length() <= 1) {
			return str;
		}
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		if(str.length() == 2) {
			return lastChar + "" + firstChar;
		}
		
		return lastChar + str.substring(1, str.length()-1) + firstChar;
	}
}

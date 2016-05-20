
public class missingChar {
	/*Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
	The value of n will be a valid index of a char in the original string (i.e. n will be in the range 
	0..str.length()-1 inclusive).*/
	public String missingChar(String str, int n) {
		StringBuilder formattedString = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(i != n) {
				formattedString.append(str.charAt(i));
			}
		}
		return formattedString.toString();
	}
}

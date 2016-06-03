
public class doubleChar {
	/*Given a string, return a string where for every char in the original, there are two chars.*/
	public String doubleChar(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			builder.append(str.charAt(i) + "" + str.charAt(i));
		}
		
		return builder.toString();
	}

}

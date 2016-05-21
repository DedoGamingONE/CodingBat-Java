
public class stringX {
	/*Given a string, return a version where all the "x" have been removed. Except an "x" at the 
	very start or end should not be removed.*/
	public String stringX(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'x') {
				builder.append(str.charAt(i) + "");
			} else {
				if(i == 0 || i == str.length()-1) {
					builder.append(str.charAt(i) + "");
				}
			}
		}
		return builder.toString();
	}
}

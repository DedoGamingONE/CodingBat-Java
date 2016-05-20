
public class doubleX {
	/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".*/
	public boolean doubleX(String str) {
		if(str.indexOf('x') == -1) {
			return false;
		}
		
		if(str.indexOf('x') == str.length()-1) {
			return false;
		}
		return str.charAt(str.indexOf('x') + 1) == 'x';
	}
}

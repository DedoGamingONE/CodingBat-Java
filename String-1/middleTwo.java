
public class middleTwo {
	/*Given a string of even length, return a string made of the middle two chars, so the string "string" 
	yields "ri". The string length will be at least 2.*/
	public String middleTwo(String str) {
		int midIndex = (str.length()/2)-1; //Start one behind because zero-based
		return str.substring(midIndex, midIndex + 2);
	}

}

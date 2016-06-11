
public class allStar {
	/**/
	public String allStar(String str) {
		//Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
 		if(str.length() == 0)
			return "";
		if(str.length() == 1)
		  return str.charAt(0) + "";
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

}

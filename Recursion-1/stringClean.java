
public class stringClean {
	/*Given a string, return recursively a "cleaned" string where adjacent chars that are the same 
	 * have been reduced to a single char. So "yyzzza" yields "yza".*/
	public String stringClean(String str) {
		if(str.length() < 2) 
			return str;
		
		if(str.charAt(0) == str.charAt(1)) {
			int count = 0;
			while(str.length() > count && str.charAt(0) == str.charAt(count)) {
				count++;
			}
			return str.charAt(0) + stringClean(str.substring(count));
		}
		
		return str.charAt(0) + stringClean(str.substring(1));
	}

}

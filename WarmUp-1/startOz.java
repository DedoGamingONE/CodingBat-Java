
public class startOz {
	/*Given a string, return a string made of the first 2 chars (if present), however include first 
	char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".*/
	public String startOz(String str) {
		StringBuilder formattedString = new StringBuilder();
		
		if(str.length() == 0) {
			return "";
		}
		
	    if(str.length() < 2) {
		  return str.charAt(0) == 'o' ? str : "";
	    }
	    
	    if(str.charAt(0) == 'o') {
	    	formattedString.append(str.charAt(0));
	    }
	    
	    if(str.charAt(1) == 'z') {
	    	formattedString.append(str.charAt(1));
	    }
	    return formattedString.toString();
	}
}

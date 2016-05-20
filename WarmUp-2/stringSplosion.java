
public class stringSplosion {
	//Given a non-empty string like "Code" return a string like "CCoCodCode".
	public String stringSplosion(String str) {
		StringBuilder builder = new StringBuilder();  
		for(int i = 0; i < str.length(); i++) {
			  builder.append(str.substring(0,i+1));
		}
		
		return builder.toString();
	}

}

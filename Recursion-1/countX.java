
public class countX {
	//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	public int countX(String str) {
	  if(str.length() == 0)
	    return 0;
	  
	  if(str.charAt(str.length()-1) == 'x') {
	    return 1 + countX(str.substring(0, str.length()-1));
	  } else {
	    return 0 + countX(str.substring(0, str.length()-1));
	  }
	}

}


public class changeXY {
	/*Given a string, compute recursively (no loops) a new string where all 
	 * the lowercase 'x' chars have been changed to 'y' chars.*/
	public String changeXY(String str) {
	  if(str.length() < 1) {
	    return str;
	  }
	  
	  if(str.charAt(0) == 'x') {
	    str = 'y' + "" + str.substring(1);
	    return str.charAt(0) + changeXY(str.substring(1));
	  } else {
	     return str.charAt(0) + changeXY(str.substring(1));
	  }
	}

}

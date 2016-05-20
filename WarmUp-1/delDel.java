
public class delDel {
	/*Given a string, if the string "del" appears starting at index 1, return a string where that "del" 
	has been deleted. Otherwise, return the string unchanged.*/
	public String delDel(String str) {
		if(str.length() == 3 && !str.equals("del") || str.equals("del") || str.length() < 3) {
			return str;
		}
				
		if(str.substring(1,4).equals("del"))
			return str.charAt(0) + "" + str.substring(4);
		else
			return str;
	
	}
}
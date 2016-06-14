
public class countHi2 {
	/*Given a string, compute recursively the number of times lowercase "hi" appears 
	 * in the string, however do not count "hi" that have an 'x' immedately before them.*/
	public int countHi2(String str) {
		if(str.length() < 2) {
			return 0;
		}
		
		if(str.length() == 2) {
			if(str.equals("hi")) {
				return 1;
			} else {
				return 0;
			}
		}
		
		if(str.substring(1,3).equals("hi") && str.charAt(0) != 'x') {
			return 1;
		} else {
			return 0;
		}
	}

}

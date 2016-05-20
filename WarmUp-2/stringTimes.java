
public class stringTimes {
	//Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	public String stringTimes(String str, int n) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < n; i++) {
			builder.append(str);
		}
		return builder.toString();
	}
}

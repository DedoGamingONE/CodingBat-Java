
public class lastDigitLogic {
	/*Given three ints, a b c, return true if two or more of them have the same rightmost digit. The 
	 * ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.*/
	public boolean lastDigit(int a, int b, int c) {
		int count = 1;
		
		if(a % 10 == b % 10) {
			count++;
		}
		
		if(b % 10 == c % 10) {
			count++;
		}
		
		if(a % 10 == c % 10) {
			count++;
		}
		
		return count >= 2;
	}
}

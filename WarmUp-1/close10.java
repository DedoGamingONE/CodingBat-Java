
public class close10 {
	/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event 
	of a tie. Note that Math.abs(n) returns the absolute value of a number.*/
	public int close10(int a, int b) {
		int closest = 0;
		if(Math.abs(10-a) > Math.abs(10-b)) {
			closest = b;
		} else if(Math.abs(10-a) < Math.abs(10-b)) {
			closest = a;
		}
		return closest;
	}
}

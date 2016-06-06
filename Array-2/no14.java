
public class no14 {
	/*Given an array of ints, return true if it contains no 1's or it contains no 4's.*/
	public boolean no14(int[] nums) {
		boolean foundOne = false;
		boolean foundFour = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1)
				foundOne = true;
			if(nums[i] == 4)
				foundFour = true;
		}
		return !foundOne || !foundFour;
	}

}


public class haveThree {
	/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.*/
	public boolean haveThree(int[] nums) {
		int threeCount = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 3)
				threeCount++;
			
			if(i != 0) {
				if(nums[i] == 3 && nums[i-1] == 3)
					return false;
			}
		}
		return threeCount == 3;
	}

}

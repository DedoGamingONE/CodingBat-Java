
public class twoTwo {
	//Given an array of ints, return true if every 2 that appears in the array is next to another 2.
	public boolean twoTwo(int[] nums) {
		if(nums.length == 1 && nums[0] == 2)
			return false;

		for(int i = 0; i < nums.length; i++) {
			if(i < nums.length-1) {
				if(nums[i] == 2) {
					if(nums[i+1] == 2) {
						i++;
					} else {
						return false;
					}
				}
			} else {
				if(nums[i] == 2) {
					if(nums[i-1]==2) {
						
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

}

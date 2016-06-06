
public class has12 {
	//Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
	
	public boolean has12(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				while(i < nums.length) {
					if(nums[i] == 2)
						return true;
					i++;
				}
			}
		}
		return false;
	}
}

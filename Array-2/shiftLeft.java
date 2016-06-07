
public class shiftLeft {
	/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
	 * You may modify and return the given array, or return a new array.*/
	public int[] shiftLeft(int[] nums) {
		if(nums.length == 0)
			return nums;
		
		int last = nums[0];
		int[] newArr = new int[nums.length];
		for(int i = 0; i < nums.length-1; i++) {
			newArr[i] = nums[i+1];
		}
		newArr[nums.length-1] = last;
		return newArr;
	}

}

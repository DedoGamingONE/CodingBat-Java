
public class makeMiddle {
	/*Given an array of ints of even length, return a new array length 2 containing the middle two elements 
	 * from the original array. The original array will be length 2 or more.*/
	public int[] makeMiddle(int[] nums) {
		int middle = nums.length/2-1;
		
		int[] arr = new int[2];
		arr[0] = nums[middle];
		arr[1] = nums[middle+1];
		return arr;
	}

}

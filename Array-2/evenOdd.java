
public class evenOdd {
	/*Return an array that contains the exact same numbers as the given array, but rearranged so that all 
	 * the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. 
	 * You may modify and return the given array, or make a new array.*/
	public int[] evenOdd(int[] nums) {
		int evenCount = 0;
		int position = 0;
		int[] result = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				evenCount++;
				result[position] = nums[i];
				position++;
			}
		}

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 != 0) {
				result[position] = nums[i];
				position++;
			}
		}
		return result;
	}

}

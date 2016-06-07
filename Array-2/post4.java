
public class post4 {
	/*Given a non-empty array of ints, return a new array containing the elements from the original array 
	 * that come after the last 4 in the original array. The original array will contain at least one 4. Note 
	 * that it is valid in java to create an array of length 0.*/
	public int[] post4(int[] nums) {
		int distanceFromEnd = nums.length-1;
		while(nums[distanceFromEnd] != 4) {
			distanceFromEnd--;
		}
		//Found it, move one ahead
		distanceFromEnd++;

		int[] result = new int[nums.length-distanceFromEnd];
		int position = 0;
		if(result.length == 0)
			return result;
		
		for(int i = distanceFromEnd; i < nums.length; i++) {
			result[position] = nums[i];
			position++;
		}
		return result;
	}

}

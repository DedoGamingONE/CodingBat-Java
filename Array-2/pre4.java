
public class pre4 {
	/*Given a non-empty array of ints, return a new array containing the elements from the original array that come before 
	 * the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to 
	 * create an array of length 0.*/
	public int[] pre4(int[] nums) {
		int count = 0;
		int position = 0;
		while(nums[count] != 4) {
			count++;
		}
		
		int[] arr = new int[count];
		if(count == 0) 
			return arr;
		
		for(int i = 0; i < count; i++) {
			arr[i] = nums[i];
		}
		return arr;
	}

}

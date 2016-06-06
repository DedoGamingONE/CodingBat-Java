
public class centeredAverage {
	/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except 
	 * ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore 
	 * just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that 
	 * the array is length 3 or more.*/
	public int centeredAverage(int[] nums) {
		  int smallest = nums[0];
		  int largest = nums[0];  
		  boolean smallFound = false;
		  boolean largeFound = false;
		  int sum = 0;
		  
		  for(int i = 0; i < nums.length; i++) {
			  smallest = Math.min(nums[i], smallest);
			  largest = Math.max(nums[i], largest);
		  }
		  
		  for(int i = 0; i < nums.length; i++) {
			  if(smallest == nums[i] && !smallFound) {
				  smallFound = true;
			  } else if(largest == nums[i] && !largeFound) {
				  largeFound = true;
			  } else {
				  sum += nums[i];
			  }
		  }
		  
		  return sum/(nums.length-2);
	}

}

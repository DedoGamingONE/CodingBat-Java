
public class zeroMax {
	/*Return a version of the given array where each zero value in the array is replaced by the largest odd value 
	 * to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.*/
	public int[] zeroMax(int[] nums) {
	  for(int i = 0; i < nums.length; i++) {
	    if(nums[i] == 0) {
	      int largest = 0;
	      int position = i;
	      while(position < nums.length) {
	        if(nums[position] % 2 != 0) {
	          largest = Math.max(largest, nums[position]);
	        }
	        position++;
	      }
	      nums[i] = largest;
	    }
	  }
	  return nums;
	}


}

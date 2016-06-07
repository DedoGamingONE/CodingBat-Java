
public class sameEnds {
	/*Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, 
	 * the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.*/
	public boolean sameEnds(int[] nums, int len) {
		int frontPos = 0;
		int backPos = nums.length-len;
		while(len != 0) {
			if(nums[frontPos] != nums[backPos]) {
				return false;
			}
			frontPos++;
			backPos++;
			len--;
		}
		return true;
	}

}

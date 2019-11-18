public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int local = 0;
		for (int i = 0; i < nums.length; i++) {
			local = Math.max(local + nums[i], nums[i]);
			max = Math.max(max, local);
		}
		return max;
	}
}
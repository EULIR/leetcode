public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int index = 0;
		while (index < nums.length) {
			if (nums[index] >= target) return index;
			index++;
		}
		return nums.length;
	}
}
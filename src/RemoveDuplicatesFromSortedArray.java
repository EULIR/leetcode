import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length == 1) return nums.length;
		if (nums[0] == nums[1]) nums[0] = Integer.MAX_VALUE;
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == nums[i - 1] || nums[i] == nums[i + 1])
				nums[i] = Integer.MAX_VALUE;
		}
		Arrays.sort(nums);
		int index = 0;
		while (index < nums.length && nums[index] != Integer.MAX_VALUE) {
			index++;
		}
		return index;
	}
}
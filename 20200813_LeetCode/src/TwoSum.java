

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 *
 */

// Given nums = [2, 7, 11, 15], target = 9,

// B/c nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1];


public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] pos = new int[2];
		for (int i = 0; i < nums.length; i ++) {
			for (int j = i; j < nums.length; j ++) {
				if (target - nums[i] == nums[j]) {
					pos[0] = i;
					pos[1] = j;
					return pos;
				}
			}
		}
		pos[0] = -1;
		pos[1] = -1;
		return pos;
	}
	
	static void solution() {
		int[] nums = {2, 7, 11, 1};
		int target = 9;
		
		int[] sol = twoSum(nums, target);
		
		System.out.println("[" + sol[0] +", " + sol[1] +"]");
	}
}

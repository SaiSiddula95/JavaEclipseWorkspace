package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		int[] input = { 0, 2, 3, 4, 5, 10, 2, 3 };
		int[] res = twoSum(input, 9);

		System.out.println(Arrays.toString(res));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		// Key = Value required to add to held number.
		// Value = The actual number
		int[] result = new int[2];
		boolean found = false;

		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				found = true;
				System.out.println("Found Match at " + i+" :! Value is: " + nums[i]);
				// We've found a match!!
				result[0] = hashMap.get(nums[i]);
				result[1] = i;
			} else {
				System.out.println("Not found adding to Map: ");
				hashMap.put(target - nums[i], i);
			}
			if (found)
				break;
		}

		return result;
	}
}

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // fallback, though question says one solution exists
    }

    // main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] result3 = solution.twoSum(new int[]{3, 3}, 6);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}

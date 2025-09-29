package leetcode;

public class N283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int write = 0;

        for (int x : nums) {
            if (x != 0) {
                nums[write++] = x;
            }
        }

        while (write < n) {
            nums[write++] = 0;
        }
    }
}

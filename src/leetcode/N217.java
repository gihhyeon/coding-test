package leetcode;

import java.util.HashSet;
import java.util.Set;

public class N217 {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (set.add(nums[i]) == false) {
//                return true;
//            }
//        }
//
//        return false;
//    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}

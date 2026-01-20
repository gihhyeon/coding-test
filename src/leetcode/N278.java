package leetcode;

public class N278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int firstBad = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                firstBad = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstBad;
    }

    // This is a placeholder for the actual API provided by LeetCode.
    private boolean isBadVersion(int version) {
        // Implementation not shown
        return false;
    }
}

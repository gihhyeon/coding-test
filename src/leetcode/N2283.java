package leetcode;

// Check if Number Has Equal Digit Count and Digit Value
public class N2283 {
    public boolean digitCount(String num) {
        int[] count = new int[10];

        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }


        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0'; // num[i]가 기대하는 값
            if (count[i] != expected) {
                return false;
            }
        }

        return true;

    }
}

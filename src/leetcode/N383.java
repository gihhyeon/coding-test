package leetcode;

import java.util.HashMap;

public class N383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            Integer count = map.get(c);

            if (count == null || count == 0) {
                return false;
            }

            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return true;
    }
}

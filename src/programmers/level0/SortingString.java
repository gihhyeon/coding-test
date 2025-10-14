package programmers.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingString {
    public List solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                list.add(c - '0');
            }

            Collections.sort(list);
        }

        return list;
    }
}

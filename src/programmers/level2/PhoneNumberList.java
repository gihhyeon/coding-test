package programmers.level2;

import java.util.Arrays;

public class PhoneNumberList {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            String current = phone_book[i];
            String next = phone_book[i + 1];

            if (next.startsWith(current)) {
                return false;
            }
        }

        return true;
    }
}

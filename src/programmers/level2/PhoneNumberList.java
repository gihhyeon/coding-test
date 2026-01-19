package programmers.level2;

import java.util.Arrays;

public class PhoneNumberList {
//    public boolean solution(String[] phone_book) {
//
//        Arrays.sort(phone_book);
//
//        for (int i = 0; i < phone_book.length - 1; i++) {
//            String current = phone_book[i];
//            String next = phone_book[i + 1];
//
//            if (next.startsWith(current)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(phone_book[i-1])) {
                return false;
            }
        }

        return true;
    }
}

package programmers.level1;

public class NumberOfpAndyInTheString {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                countP++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                countY++;
            }
        }


        if (countP == 0 && countY == 0) {
            return true;
        }

        if (countP == countY) {
            return true;
        } else {
            return false;
        }


    }
}

package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class AthletesWhoFailedToFinish {
//    public String solution(String[] participant, String[] completion) {
//        Map<String, Integer> map = new HashMap<>();
//
//        for (String p : participant) {
//            map.put(p, map.getOrDefault(p, 0) + 1);
//        }
//
//        for (String c : completion) {
//            map.put(c, map.get(c) - 1);
//        }
//
//        for (String name : map.keySet()) {
//            if (map.get(name) > 0) {
//                return name;
//            }
//        }
//
//        return "";
//    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}

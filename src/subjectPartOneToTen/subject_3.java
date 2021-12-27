package subjectPartOneToTen;

import java.util.HashMap;
import java.util.Map;

//找的是无重复字符最长串
public class subject_3 {
    public static int lengthOfLongestSubstring(String s) {
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                int result = 1;
                String matchString = s.substring(j, j + i);
                Map<Character, Integer> map = new HashMap<>();
                char[] ch = matchString.toCharArray();
                for (char c : ch) {
                    Integer t = map.get(c);
                    if (t == null) {
                        map.put(c, 1);
                    } else {
                        map.put(c, map.get(c) + 1);
                    }
                }

                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue() != 1) {
                        result = 0;
                    }
                }
                if (result == 1) {
                    end = i;
                }

            }
        }
        return end;
    }
}
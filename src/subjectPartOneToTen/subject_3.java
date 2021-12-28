package subjectPartOneToTen;

import java.util.HashMap;
import java.util.Map;

//找的是无重复字符最长串
public class subject_3 {
    public static int lengthOfLongestSubstring(String s) {
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < s.length()-i+1; j++) {
                int result = 1;map.clear();String matchString = s.substring(j, j + i);char[] ch = matchString.toCharArray();
                for (char c : ch) { map.merge(c, 1, Integer::sum); }
                System.out.println(matchString);
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > 1) {
                        result = 0;break;
                    }
                }
                if (result==1)
                { end=i;break; }
            }
        }
        return end;
    }
}
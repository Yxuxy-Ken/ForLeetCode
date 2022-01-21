package SolvedButNotCompletely;

//找的是无重复字符最长串
//窗口滑动
public class subject_3 {

    public static int windowSlide(String s) {
        int end = 0;
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for(int j=0;j<chars.length;j++){
            int i = j;
            while (i < chars.length) {
                if (stringBuffer.indexOf(String.valueOf(chars[i])) == -1) {
                    stringBuffer.append(chars[i++]);
                    if (stringBuffer.length() > end)
                        end = stringBuffer.length();
                } else {
                    stringBuffer.delete(0, stringBuffer.length());
                    break;
                }
            }
        }
        return end;
    }
}
//能用, 但是过不了超长字符串的时间要求
//    public static int lengthOfLongestSubstring(String s) {
//        int  = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 1; i <= s.length(); i++) {
//            for (int j = 0; j < s.length()-i+1; j++) {
//                int result = 1;map.clear();String matchString = s.substring(j, j + i);char[] ch = matchString.toCharArray();
//                for (char c : ch) { map.merge(c, 1, Integer::sum); }
//                System.out.println(matchString);
//                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                    if (entry.getValue() > 1) {
//                        result = 0;break;
//                    }
//                }
//                if (result==1)
//                { end=i;break; }
//            }
//        }
//        return end;
//    }
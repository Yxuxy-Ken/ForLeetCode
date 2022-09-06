package SolvedSubject;

public class _3 {

    public int lengthOfLongestSubstring(String s) {
        int end = 0;
        char[] chars = s.toCharArray();
        StringBuilder stringBuffer = new StringBuilder();
        for (int j = 0; j < chars.length; j++) {
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

    public static void run() {
        _3 run = new _3();
        String s = "abcafefesfd";
        System.out.println(run.lengthOfLongestSubstring(s));
    }

}
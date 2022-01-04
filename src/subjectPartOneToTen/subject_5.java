package subjectPartOneToTen;

/**
 * 找最长回文字符串,本来以为还是滑动窗口
 *
 * 实际上这是动态规划的问题
 */
public class subject_5 {
    public static String windowSlide(String s) {
        int end = 0;
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        String t= "";
        for(int j=0;j<chars.length;j++){
            for (int i = j;i < chars.length;i++){
                stringBuffer.append(chars[i]);
                if (testString(stringBuffer) && stringBuffer.length()>end){
                    end=stringBuffer.length();
                    t=stringBuffer.toString();
                }
            }
            stringBuffer.delete(0,stringBuffer.length());
        }
        return t;
    }
    public static boolean testString(StringBuffer s){
        char[] c  = s.toString().toCharArray();
        StringBuffer s1  = new StringBuffer();
        StringBuffer s2  = new StringBuffer();
        if (c.length%2==0){
            for (int i = 0; i < c.length / 2; i++)
                s1.append(c[i]);
            for (int j = c.length-1; j>=c.length/2 ; j--) {
                s2.append(c[j]);
            }
        } else {
            for (int i = 0; i <= c.length / 2; i++) {
                s1.append(c[i]);
            }
            for (int j = c.length-1; j >=c.length/2; j--) {
                s2.append(c[j]);
            }
        }
        return s1.toString().equals(s2.toString());
    }

    /*
    copy
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
//         保存起始位置，测试了用数组似乎能比全局变量稍快一点
        int[] range = new int[2];
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
//             把回文看成中间的部分全是同一字符，左右部分相对称
//             找到下一个与当前字符不同的字符
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    public static int findLongest(char[] str, int low, int[] range) {
//         查找中间部分
        int high = low;
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
//         定位中间部分的最后一个字符
        int ans = high;
//         从中间向左右扩散
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
//         记录最大长度
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}
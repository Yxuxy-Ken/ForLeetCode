package subjectPartOneToTen;

//找最长回文字符串, 还是滑动窗口
public class subject_5 {
    public static StringBuffer windowSlide(String s) {
        int end = 0;
        int j = 0;
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 =new StringBuffer();

        while (j < chars.length){
            for (int i = j;i < chars.length;i++){
                stringBuffer.append(chars[i]);
                if (testString(stringBuffer) && (i-j)>end){
                    end=i-j;
                    stringBuffer1.delete(0,stringBuffer1.length());
                    stringBuffer1.append(stringBuffer);
                }
            }
            j++;
            stringBuffer.delete(0,stringBuffer.length());
        }

        return stringBuffer1;
    }
    public static boolean testString(StringBuffer s){

        for (int i = 0; i < s.length(); i++) {

        }
    }
}
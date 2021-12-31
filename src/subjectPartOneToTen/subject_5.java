package subjectPartOneToTen;

//找最长回文字符串, 还是滑动窗口
//超出时间限制
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
                if (testString(stringBuffer) && stringBuffer.length()>end){
                    end=stringBuffer.length();
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

        if(s.length()%2==0)
        {
            s.substring(0,s.length()/2);

        } else {

        }



        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        if (s1==s2)
            return true;
        else
            return false;
    }
}
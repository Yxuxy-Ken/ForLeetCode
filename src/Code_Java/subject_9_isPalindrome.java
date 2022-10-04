package Code_Java;

public class subject_9_isPalindrome {
    public boolean isPalindrome(int x) {
        int s1 = 0, s2 = x;
        if (x < 0) {
            return false;
        }
        while (true) {
            s1 = s1 * 10 + x % 10;
            x /= 10;
            if (x == 0)
                break;
        }
        return s1==s2;
    }
}

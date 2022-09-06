package SolvedSubject;

import java.math.BigDecimal;

public class Home {
    public static void main(String[] args) {
        float a = (float) 12.12321;
        BigDecimal b  =   new  BigDecimal(a);
        float   m_price   =  b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        System.out.println(m_price);
    }
}

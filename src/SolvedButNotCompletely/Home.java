package SolvedButNotCompletely;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Home {
    public static void main(String[] args) throws ParseException {
        String startTime = "2022-1-9";
        String endTime = "2022-01-10";

        List<String> days = new ArrayList<String>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


        Date start = dateFormat.parse(startTime);
        Date end = dateFormat.parse(endTime);
        System.out.println(start);
        System.out.println(end);

        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
        while (tempStart.before(tempEnd)) {
            days.add(dateFormat.format(tempStart.getTime()));
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }

        for (String values : days) {
            System.out.println(values);
        }

    }


}

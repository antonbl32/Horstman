package by.anton.core.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String dateString="202103011015";
        DateFormat dateFormat=new SimpleDateFormat("yyyyMMddHHmm");
        Date date=dateFormat.parse(dateString);
        System.out.println(date);
        DateFormat dateFormat1=new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String dateToString=dateFormat1.format(date);
        System.out.println(dateToString);
        Double m=2.1;
        Double k=2.1;
        System.out.println(m.equals(k));

    }
}

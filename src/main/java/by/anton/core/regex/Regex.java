package by.anton.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String m="bl 32 @mail.ru@###!!!";
//        Pattern pattern=Pattern.compile("\\w{4,}@\\w{4,}\\.\\w{2,}");
        Pattern pattern=Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher=pattern.matcher(m);
        while (matcher.find())
            System.out.println(matcher.start()+"    "+matcher.group());


    }
}

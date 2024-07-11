package org.fai.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public void RegexExample1(){
        try {
            String regex = "[0-9]+";
            Pattern regexPattern = Pattern.compile(regex);
            Matcher matcher = regexPattern.matcher("Xin chao T2310E!");
            if (matcher.find()) {
                System.out.println(matcher.group());
                System.out.println(matcher.groupCount());
            }
            for(int i = 0 ; i < matcher.groupCount(); i++){
//                System.out.println(matcher.group(i));
                System.out.println(matcher.group(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void RegexExample2(){
        String regex = ":";
        Pattern regexPattern = Pattern.compile(regex);
        String dayInWeek = "MON:TUE:WED:THU:FRI:SAT:SUN";
        String[] days = regexPattern.split(dayInWeek);
        for(var day: days){
            System.out.println(day);
        }

    }
    public void RegexExample3(){
        String regex = ":";
        Pattern regexPattern = Pattern.compile(regex);
        String dayInWeek = "MON:TUE:WED:THU:FRI:SAT:SUN";
        String newDayInWeek = dayInWeek.replaceAll(regex,"_");
        System.out.println(newDayInWeek);
        String[] days = new String[]{
                "1",
                "2",
                "3",
                "4",
                "5"
        };
//        days[4] ="5";
//        String[] newDays = new String[3];
//        newDays[0] = "6";
//        newDays[1] = "7";
//        newDays[2] = "8";
//        newDays[3] = "9";
    }
}

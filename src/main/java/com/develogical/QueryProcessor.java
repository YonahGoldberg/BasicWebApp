package com.develogical;
import java.util.ArrayList;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("guay")) {
            return "Guay is the spanish word for cool. Like Yonah. Yonah is very cool (guay).";
        }
        else if (query.toLowerCase().contains("largest")) {
            String[] split = query.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for (String str : split) {
                int number;
                try {
                    number = Integer.parseInt(str);
                    list.add(number);
                } catch (NumberFormatException e) {};
            }
            if (list.isEmpty()) {
                return "No number found";
            }
            int max = list.get(0);
            for (int i : list) {
                if (i > max) {
                    max = i;
                }
            }
            return "The largest number is " + max;
        }
        else if (query.toLowerCase().contains("name")) {
            return "Yonah is super cool";
        }
        return "";
    }
}

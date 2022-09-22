package com.develogical;
import java.util.ArrayList;

public class QueryProcessor {
    public ArrayList<Integer> parseNumbers(String query) {
        String[] split = query.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String str : split) {
            int number;
            try {
                number = Integer.parseInt(str);
                list.add(number);
            } catch (NumberFormatException e) {};
        }
        return list;
    }

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
            ArrayList<Integer> list = parseNumbers(query.toLowerCase());
            if (list.isEmpty()) {
                return "No number found";
            }
            int max = list.get(0);
            for (int i : list) {
                if (i > max) {
                    max = i;
                }
            }
            return max + "";
        }
        else if (query.toLowerCase().contains("name")) {
            return "Yonah is super cool";
        }
        else if (query.toLowerCase().contains("square and a cube")) {
            ArrayList<Integer> list = parseNumbers(query.toLowerCase());
            for (int i : list) {
                boolean square = false;
                boolean cube = false;
                for (int j = 0; j < i; j++) {
                    if (j * j == i) {
                        square = true;
                    }
                    if (j * j * j == i) {
                        cube = true;
                    }
                }
                if (square && cube) {
                    return "" + i;
                }
            }
            return "There are no squares or cubes here";
        }
        else if (query.toLowerCase().contains("multiplied")) {
            ArrayList<Integer> list = parseNumbers(query.toLowerCase());
            int mult = 1;
            for (int i : list) {
                mult *= i;
            }
            return "" + mult;
        }
        else if (query.toLowerCase().contains("eiffel")) {
            return "paris";
        }
        return "";
    }
}

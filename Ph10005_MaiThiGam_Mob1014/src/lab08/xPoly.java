package lab08;

import java.util.ArrayList;
import java.util.Collections;

public class xPoly {
// bài 1

    public static final double sum(double... x) {
        int sum = 0;
        for (double a : x) {
            sum += a;

        }
        return sum;
    }

    public static double min(double... x) {

        ArrayList<Double> list = new ArrayList<Double>();
        for (double a : x) {
            list.add(a);
        }
        Collections.sort(list);

        return list.get(0);
    }
// bài 2

    public static double max(double... x) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (double a : x) {
            list.add(a);
        }
        Collections.sort(list);

        return list.get(list.size() - 1);
    }

// bào 
    public static String toUpperFisrtChar(String s) {
        s = s.toLowerCase();
        String[] ss = s.split(" ");
        String s2 = "";
        for (int i = 0; i < ss.length; i++) {
            String s1 = " ";
            if (ss[i].length() != 0) {
                s1 += Character.toUpperCase(ss[i].charAt(0));
                if (ss[i].length() > 1) {
                    s1 += ss[i].substring(1);
                }
                s2 += s1;
                if (i < ss.length) {
                    s2 += " ";
                }
            }
        }
        if (s2.charAt(s2.length() - 1) == ' ') {
            s2 += "\b";
        }
     
        return s2;

    }

}

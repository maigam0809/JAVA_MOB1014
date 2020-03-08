package LAB05;

import java.util.ArrayList;

/**
 *
 * @author luong
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList <String> a=new ArrayList<String>();
        a.add("Cường");
        a.add("Tuấn");
        a.add("Phương");
        a.add("Hồng");
        a.add(1,"Hạnh");
        a.set(0,"Tèo");
        a.remove(3);
        a.remove("Phương");
        int x=a.size()-a.indexOf("Hồng");
        System.out.println("ket qua x là: "+x);
    }
}

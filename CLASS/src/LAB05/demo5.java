package LAB05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demo5 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập câu hỏi: ");
            String ch = scan.nextLine();
            list.add(ch);

        }
        Collections.shuffle(list);
        for (String x : list) {
            System.out.println(x);
        }
    }
}

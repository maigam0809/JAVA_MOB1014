package LAB05;

import java.util.ArrayList;
import java.util.Scanner;
public class tinh_tong {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Mời nhập vào số lương phan tử: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Double x = Double.parseDouble(scan.nextLine());
            a.add(x);
        }
        double s = 0;
//        for(Double x:a){
//            s=s+x;
//        }
        for (int i = 0; i < n; i++) {
            s = s + a.get(i);
        }
        System.out.printf("Tổng :%.1f",s);

    }
}

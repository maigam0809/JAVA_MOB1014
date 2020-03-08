package LAB05;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

public class bai1_lab05 {

    public static void main(String[] args) {

        double sum = 0;
        double number;

        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Mời nhập: ");
            Double x = Double.parseDouble(scan.nextLine());
            list.add(x);

            System.out.print("Nhập thêm (Y/N):");
            if (scan.nextLine().equals("N")) {
                break;
            }    
        }
        
        System.out.println("Danh sách là");

        for (double x : list) {
            System.out.println(x);
            sum += x;
        }

        System.out.printf("Tổng = %.2f", sum);

    }
}

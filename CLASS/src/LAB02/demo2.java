package LAB02;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số a:");
        float a = scan.nextFloat();
        if (a > 0) {
            System.out.printf("Căn bậc hai của số đó là :%.1f", Math.sqrt(a));
        } else {
            System.out.printf("Không có căn bậc hai của số đó.");
        }
    }
}
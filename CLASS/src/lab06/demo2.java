package lab06;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String moblie = scan.nextLine();
        System.out.println("Số moblie:");


        String pattern = "0[0-9] {9,10}";
        if (moblie.matches(pattern)) {
            System.out.println("Bạn đã nhập đúng.");
        } else {
            System.out.println("Bạn nhap sai.");
        }

    }
}

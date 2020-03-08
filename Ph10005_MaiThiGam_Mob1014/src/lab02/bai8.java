package lab02;

import java.util.Scanner;

public class bai8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên : ");
        int n = scan.nextInt();
boolean b = 9 < 2 && true || 4 > 3;
if (n > 0) {
            System.out.printf("%d là số nguyên dương.\n", n);
        } else {
            System.out.printf("%d là số nguyên âm.\n", n);
        }
        

    }
}

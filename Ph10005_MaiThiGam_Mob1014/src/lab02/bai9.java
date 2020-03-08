package lab02;

import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập n từ bàn phím:");
        int  n = scan.nextInt();
        int temp = (int)Math.sqrt(n);
        if(temp*temp == n) {
            System.out.printf("%d là số chính phương.",n);
        }
        else {
            System.out.printf("%d không là số chính phương.",n);
        }
    }

}

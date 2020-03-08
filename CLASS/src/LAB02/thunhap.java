package LAB02;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class thunhap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số tiền lương:");
        float a = scan.nextFloat();
        System.out.print("Nhập số tiền thuong:");
        float b = scan.nextFloat();
        float c = a + b;
        if (c < 9000000) {
            System.out.print("Không phải nộp thuế.");
        } else if (c < 15000000) {
            System.out.printf("thuế cần đóng là: %.2f\n", 0.1 * c);
        } else if (c < 30000000) {
            System.out.printf("thuế cần đóng là: %.2f \n", 0.15 * c);
        } else {
            System.out.printf("thuế cần đóng là: %.2f \n", 0.2 * c);
        }
    }
}

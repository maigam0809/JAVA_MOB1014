package LAB02;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class nam_nhuan {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số tháng của năm:");
        int a = scan.nextInt();
        System.out.print("Nhập số năm:");
        int b = scan.nextInt();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.printf("Tháng có 31 ngày.");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.printf("Tháng có 30 ngày.");
                break;
            }
            case 2: {
                if ((b % 4 == 0 && b%100 !=0) || b%400 ==0) {
                    System.out.printf("Tháng có 29 ngày.Năm nhuận");

                }
                System.out.printf("Tháng có 28 ngày. Vì Năm k nhuận");

            }
            break;
            default:
                System.out.printf("bạn đã nhập sai.");
                break;
        }

    }
}

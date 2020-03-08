package lab02;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n+---------------------------------------------+\n");
        System.out.print("1.Giải phương trình bậc nhất.\n");
        System.out.print("2.Giai phương trình bậc hai.\n");
        System.out.print("3.Tính tiền điện.\n");
        System.out.print("0.Thoát.\n");
        System.out.print("+---------------------------------------------+\n");
        System.out.print("Nhập chức năng : ");
        int chucNang = scan.nextInt();
        switch (chucNang){
            case 1:
                bai1.main(args);
                break;
            case 2:
                bai2.main(args);
                break;
            case 3:
                bai3.main(args);
            case 4:
                System.exit(0);
            default:
                System.out.printf("Bạn đã nhập sai");
        }

    }
}

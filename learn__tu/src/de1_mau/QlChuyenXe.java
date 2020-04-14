package de1_mau;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class QlChuyenXe {

    public static void main(String[] args) {

        int x;
        Scanner scan = new Scanner(System.in);

        ListChuyenXe dscx = new ListChuyenXe();

        do {
            System.out.println("\t--------------------------------");
            System.out.println("\t1.Them chuyen Noi Thanh");
            System.out.println("\t2.them chuyen Ngoại Thành");
            System.out.println("\t3.Hiển thị doanh thu chuyến xe");
            System.out.println("\t0.Exit");
            System.out.println("\t--------------------------------");
            System.out.println("\t Mời bạn chọn chức năng: ");
            x = scan.nextInt();
            System.out.println("--------->>");
            switch (x) {
                case 1:
                    dscx.listcx(1);
                    break;
                case 2:
                    dscx.listcx(2);
                    break;
                case 3:
                    dscx.xuat();
                    break;
//            case 0:
//                System.out.println("Thoát");
//                System.exit(0);
//                break;
//            default:
//                System.out.print("Mời bạn nhập lại: ");

            }
        } while (x != 0);
         System.out.println(" ");
    }
}

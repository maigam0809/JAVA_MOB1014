package bai3;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//Thêm mới thí sinh.
//Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//Tìm kiếm theo số báo danh.
//Thoát khỏi chương trình.
public class program {

    public static void main(String[] args) {
        quan_li_sinh_vien ql = new quan_li_sinh_vien();
        Scanner scan = new Scanner(System.in);
        int chon;
        do {
            menu();
            chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1:
                    ql.NhapDanhSach();
                    break;
                case 2:
                    ql.XuatDanhSach();
                    break;
                case 3:
                    ql.TimKiem();
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Mời bạn nhập lại");
            }
            if (chon != 0) {
                chon = -1;
            }
        } while (chon < 0 || chon > 3);
    }

    public static void menu() {
        System.out.println("================ Menu==============");
        System.out.println("1.Thêm mới sinh viên.");
        System.out.println("2.Hiển thị thông tin của thí sinh và khối thi");
        System.out.println("3.tìm kiếm theo số báo danh.");
        System.out.println("0.Thoát");
        System.out.println("==================================");
        System.out.print("Mời nhập chức năng: ");
    }

}

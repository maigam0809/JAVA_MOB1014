package de1;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//Công ty du lịch V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
// Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
// Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi được, doanh thu.
//Thực hiện các yêu cầu sau:
// Xây dựng các lớp với chức năng thừa kế.
// Viết chương trình quản lý các chuyến xe theo dạng cây thừa kế với các phương thức sau:
//- Nhập, xuất danh sách các chuyến xe (danh sách có thể dùng cấu trúc mảng).
//- Tính tổng doanh thu cho từng loại xe
public class program {

    public static void main(String[] args) {
        quan_li ql = new quan_li();
        Scanner scan = new Scanner(System.in);
        int chon;
        do {
            menu();
            chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1:
                    ql.NhapDanhSach();
                    ql.XuatDanhSach();
                    break;
                case 2:
                    ql.TongDoanhThu();
                    break;
                case 0:
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Mời bạn nhập lại: ");
                    break;
            }
            if (chon != 0) {
                chon = -1;
            }

        } while (chon < 0 || chon > 2);
    }

    public static void menu() {
        System.out.println("=====================Menu================");
        System.out.println("1.Nhập Và Xuất các chuyến xe.");
        System.out.println("2.Tính tổng doanh thu cho từng loại xe.");
        System.out.println("3.Thoát.");
        System.out.println("===================================");
        System.out.print("Mời bạn chọn chức năng: ");
    }

}

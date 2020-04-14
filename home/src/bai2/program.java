package bai2;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class program {

    public static void main(String[] args) {
        quan_li_sach ql = new quan_li_sach();
        Scanner scan = new Scanner(System.in);
        int chon;
        
        do {
           menu();
            chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1:
                    ql.Them();
                    break;
                case 2:
                    ql.Xoa();
                    break;
                case 3:
                    ql.HienThi();
                    break;
                case 4:
                    ql.TimKiem();
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Bạn đã nhập sai.");
                    break;
            }
            if (chon != 0) {
                chon = -1;
            }

        } while (chon < 0 || chon > 5);
    }

    public static void menu() {
        System.out.println("===================MENU================");
        System.out.println("1.Thêm mới tài liệu");
        System.out.println("2.Xóa tài liệu");
        System.out.println("3.Hiển thị thông tin về tài liệu");
        System.out.println("4.Tìm kiếm tài liệu theo loại.");
        System.out.println("0.Thoát.");
        System.out.println("======================================");
        System.out.println("Mời bạn chọn chức năng bạn muốn: ");
    }

}

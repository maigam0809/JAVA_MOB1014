package bai1;

import java.util.Scanner;

/**
 *
 * @author luong
 */
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

                    ql.NhapThongTin();
                    break;
                case 2:

//                    ql.HienThiTheoTen();
                    ql.hienThi();
                    break;
                case 3:

                    ql.XuatThongTin();
                    break;
                case 4:
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn đã chọn sai.");
                    break;

            }
            if (chon != 0) {
                chon = -1;
            }
        } while (chon < 0 || chon > 4);
    }

    public static void menu() {
        System.out.println("============Mời bạn chọn chứ năng ========");
        System.out.println("1.Thêm mới cán bộ");
        System.out.println("2.Tìm hiển thị theo tên");
        System.out.println("3.Hiển thị thông tin về danh sách cán bộ");
        System.out.println("4.Thoát");
        System.out.println("=========================================");
        System.out.println("Mời bạn chọn chức năng: ");
    }
}

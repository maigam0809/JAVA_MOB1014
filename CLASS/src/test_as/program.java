package test_as;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class program {
     public static void main(String args[]) {
        quan_li_nhan_vien ql = new quan_li_nhan_vien();
        Scanner scan = new Scanner(System.in);

        int chon;
        do {
            menu();
            chon = scan.nextInt();
            switch (chon) {
                case 1:
                    ql.NhapDanhSach();
                    break;
                case 2:
                    ql.XuatDanhSach();
                    break;
                case 3:
                    ql.TimVaHienThi();
                    break;
                case 4:
                   ql.Xoa();
                    break;
                case 5:
                    ql.CapNhat();
                    break;
                case 6:
                   ql.KhoangLuong();
                    break;
                case 7:
                    ql.SapXepTheoHoten();
                    break;
                case 8:
                    ql.SapXepTheoThuNhap();
                    break;
                case 9:
                    
                    break;
                case 0:
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Mời bạn nhập lại :");
                    break;

            }
            if (chon != 0) {
                chon = -1;
            }
        } while (chon < 0 || chon > 9);

    }

    public static void menu() {
        System.out.println("======================Menu=================");
        System.out.println("1.Nhập danh sách nhân viên");
        System.out.println("2.Xuất danh sách nhân viên");
        System.out.println("3.Tìm và hiển thị nhân viên từ mã nhập.");
        System.out.println("4.Xóa nhân viên theo mã nhập ");
        System.out.println("5.Cập nhật thông tin nhân viên theo mã nhập.");
        System.out.println("6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím ");
        System.out.println("7.Sắp xếp nhân vien theo họ tên.");
        System.out.println("8.Sắp xếp nhân viên theo thu nhập.");
        System.out.println("9.Xuất danh sách 5 sinh viên có điểm cao nhất.");
        System.out.println("0.Thoát");
        System.out.println("===========================================");
        System.out.print("Mời bạn chọn chức năng: ");
    }
}

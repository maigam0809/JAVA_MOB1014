package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luong
 */
public class quan_li_sinh_vien {

    ArrayList<student> list = new ArrayList<student>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void NhapDanhSach() {
        System.out.print("=============Nhập số lượng tài liệu=========");
        n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("========Nhập tài liệu thứ : " + (i + 1) + "=========");
            System.out.println("================== Có 3 khối==================");
            System.out.println("1.Khối A( Toán , Lý, Hóa)");
            System.out.println("2.Khối B (Toán , Hóa, Sinh)");
            System.out.println("3.Khối C (Văn , Sử, Địa)");
            System.out.println("=============================================");
            System.out.print("Mời bạn chọn khối năng : ");

            int a;
            do {
                a = Integer.parseInt(scan.nextLine());

                switch (a) {
                    case 1:
                        student_A khoia = new student_A();
                        list.add(khoia);
                        khoia.nhap();

                        break;
                    case 2:
                        student_B khoib = new student_B();
                        list.add(khoib);
                        khoib.nhap();
                        break;
                    case 3:
                        student_C khoic = new student_C();
                        list.add(khoic);
                        khoic.nhap();
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại: ");
                        break;
                }

            } while (a < 0 || a > 3);

        }
    }

    public void XuatDanhSach() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n  ", "Mã code: ", " Họ và tên ", "Địa Chỉ :", " Mức ưu tiên ", "Khối: ");
        for (student b : list) {
            b.xuat();
        }
    }

    public void TimKiem() {
        System.out.print("Nhập mã sinh viên muốn tìm :");
        String ma = scan.nextLine();
        System.out.println("======Thông tin sinh viên đó là ======");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n ", "Mã code: ", " Họ và tên ", "Địa Chỉ :", " Mức ưu tiên ", "Khối: ");

        for (student b : list) {
            if (b.code.equalsIgnoreCase(ma)) {
                b.xuat();
            }
        }
    }
}

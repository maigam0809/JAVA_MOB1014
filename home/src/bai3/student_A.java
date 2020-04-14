package bai3;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
//
//Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
//
//Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
//
//Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
//
//Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.
//
//Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:
//
//Thêm mới thí sinh.
//Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//Tìm kiếm theo số báo danh.
//Thoát khỏi chương trình.
public class student_A extends student {

    public String khoi = "A";

    public student_A() {

    }

    public student_A(String khoi, String code, String name, String dia_chi, int muc_uu_tien) {
        super(code, name, dia_chi, muc_uu_tien);
        this.khoi = khoi;
    }

    @Override
    public void nhap() {
        super.nhap();

    }

    public void xuat() {
        super.xuat();
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s", "Mã code: ", " Họ và tên ", "Địa Chỉ :", " Mức ưu tiên ", "Khối: ");
        System.out.printf("%-20s %-20s %-20s %-20d %-20s \n", code, name, dia_chi, muc_uu_tien, khoi);
    }

}

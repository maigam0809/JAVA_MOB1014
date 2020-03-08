package lab06;

import java.util.ArrayList;
import java.util.Scanner;

public class quan_li_sinh_vien {

    ArrayList<sinhVien> list = new ArrayList<sinhVien>();
    Scanner scan = new Scanner(System.in);
    int n;
// nhập sinh viên

    public void nhap() {
        System.out.println("Nhập số lượng sinh viên:");
        n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            sinhVien sv = new sinhVien();
            System.out.printf("Nhập sv thứ :%d.\n", i);
            System.out.println("Nhập tên:");
            sv.hoTen = scan.nextLine();
            System.out.println("Nhập email:");
            sv.email = sv.ktEmail();
            System.out.println("Nhập SDT:");
            sv.phone = sv.ktSDT();
            System.out.println("Nhập cmnd:");
            sv.cmnd = sv.ktCMND();
            list.add(sv);
        }
    }

    // xuât ssinh viên
    public void xuat() {
        System.out.printf("%-20s %-10s %10s %20s \n", "Họ tên: ", "Email: ", "SDT:", "CMND:");
        for (sinhVien s : list) {
            System.out.printf("%-20s %-10s %10s %20s \n", s.hoTen, s.email, s.phone, s.cmnd);
        }
    }
}

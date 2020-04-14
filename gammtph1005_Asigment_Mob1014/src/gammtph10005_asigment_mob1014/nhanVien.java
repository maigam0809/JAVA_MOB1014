package gammtph10005_asigment_mob1014;

import java.util.Scanner;
import java.util.Collections;
import java.util.Scanner;

public class nhanVien {

    Scanner scan = new Scanner(System.in);
    protected String maNV;
    public String hoTen;
    public double luong;

    public nhanVien() {
    }

    public nhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public double getThueTN() {
        double thue;
        if (luong < 9000000) {
            thue = 0;
        } else if (luong <= 15000000) {
            thue = luong * 0.1;
        } else {
            thue = luong * 0.12;

        }
        return thue;
    }

    public Double getThuNhap() {
        return (luong - getThueTN());
    }

    public void nhap() {
        System.out.print("Nhập mã nhân vien là : ");
        this.maNV = scan.nextLine();
        System.out.print("Nhập tên nhân viên là: ");
        this.hoTen = scan.nextLine();
        System.out.print("Nhập lương: ");
        this.luong = Double.parseDouble(scan.nextLine());
    }

// hàm xuất
    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ","Thu Nhập:", "Thuế TN:");
        System.out.printf("%-20s %-20s %-20.0f %-20.0f %-20.0f \n", maNV, hoTen, luong, getThuNhap(), getThueTN());
    }

}

package gammtph10005_asigment_mob1014;

import java.util.Scanner;
import java.util.Collections;
import java.util.Scanner;

public class nhanVien {

    Scanner scan = new Scanner(System.in);
    private String maNV;
    private String hoTen;
    private double luong;

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
// hàm getter và setter 
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Double getThuNhap() {
        return (luong - getThueTN());
    }

    public void nhap() {
        System.out.print("Nhập mã nhân viên là : ");
        maNV = scan.nextLine();
        System.out.print("Nhập tên nhân viên là: ");
        hoTen = scan.nextLine();
        System.out.print("Nhập lương: ");
       luong = Double.parseDouble(scan.nextLine());
    }

// hàm xuất
    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ","Thu Nhập:", "Thuế TN:");
        System.out.printf("%-20s %-20s %-20.0f %-20.0f %-20.0f \n",maNV,hoTen,luong, getThuNhap(), getThueTN());
    }

}

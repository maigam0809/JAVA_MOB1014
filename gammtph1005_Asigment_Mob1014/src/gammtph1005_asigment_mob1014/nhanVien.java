package gammtph1005_asigment_mob1014;

import java.util.Scanner;
import java.util.Collections;
import java.util.Scanner;

public class nhanVien {

    Scanner scan = new Scanner(System.in);
    public String maNV;
    public String hoTen;
    public double luong;
   
  public nhanVien(){}

    public nhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    

    public Double getThueTN() {
           double thue;
        if (luong < 9000000) {
            thue=0;
        } else if (luong <= 15000000) {
           thue=luong*0.1;
        } else {
            thue =luong* 0.12;

        }
        return thue;
    }
      public double getThuNhap() {
        return (luong-getThueTN());
    }
    // set và get
//
//    public String getMaNV() {
//        return maNV;
//    }
//
//    public void setMaNV(String maNV) {
//        this.maNV = maNV;
//    }
//
//    public String getTenNV() {
//        return hoTen;
//    }
//
//    public void setTenNV(String hoTen) {
//        this.hoTen = hoTen;
//    }
//
//    public double getLuong() {
//        return luong;
//    }
//
//    public void setLuong(double luong) {
//        this.luong = luong;
//    }
    // hàm nhập

    public void nhap() {
        System.out.println("Nhập mã nhân vien");
        this.maNV = scan.nextLine();
        System.out.println("Nhập tên nhân viên là: ");
        this.hoTen = scan.nextLine();
        System.out.println("Nhập lương: ");
        this.luong = Double.parseDouble(scan.nextLine());
    }

// hàm xuất
    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ","Thu Nhập:", "Thuế TN:");
        System.out.printf("%-20s %-20s %-20.0f %-20.0f %-20.0f \n",maNV, hoTen, luong,getThuNhap(),getThueTN());
    }

}

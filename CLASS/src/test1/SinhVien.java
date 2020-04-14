package test1;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class SinhVien {

    public String maSV;
    public String hoTen;
    public double diemToan;
    public double diemVan;
    Scanner scan = new Scanner(System.in);

    SinhVien() {

    }

    public double getTongDiem() {
        return diemToan * 2 + diemVan;

    }

    public SinhVien(String maSV, String hoTen, double diemToan, double diemVan) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public String getXepLoai() {
        String loai;

        if (getTongDiem() < 15) {
            loai = "Rot";
        } else {
            loai = "dau";
        }
        return loai;
    }

    public void nhap() {

        System.out.println("Nhap ma sinh vien: ");
        maSV = scan.nextLine();
        System.out.println("Nhap ho ten sinh vien :");
        hoTen = scan.nextLine();
        System.out.println("Nhap diem toan: ");
        diemToan = Double.parseDouble(scan.nextLine());
        System.out.println("Nhap diem van: ");
        diemVan = Double.parseDouble(scan.nextLine());

    }

    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s ", "Ma Sinh vien:", "Ho Ten", "Diem toan :", "Diem Van:");
        System.out.printf("%-20s %-20s %-20.1f %-20.1f %-20.1f %-20s \n ", maSV, hoTen, diemToan, diemVan, getTongDiem(), getXepLoai());
      
    }

}

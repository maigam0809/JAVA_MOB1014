package lab06;

import java.util.Scanner;

public class sanpham {

    private String tenSP;
    private double gia;
    private String hang;
    Scanner scan = new Scanner(System.in);

    public sanpham(String tenSP, double gia, String hang) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.hang = hang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public sanpham() {
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        System.out.println("Nhập tên sản phẩm :");
        this.tenSP = scan.nextLine();
        System.out.println("Nhập giá sản phẩm :");
        this.gia = Double.parseDouble(scan.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        this.hang = scan.nextLine();

    }

    public void xuat() {
        System.out.printf("Tên: %s", this.tenSP);
        System.out.printf("Đơn giá: %2.f", this.gia);
        System.out.printf("Hãng :%s",this.hang);

    }
}

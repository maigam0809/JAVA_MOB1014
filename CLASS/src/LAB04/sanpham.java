package LAB04;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class sanpham {
    Scanner scan = new Scanner(System.in);

    private String tenSP;
    private double donGia;
    private double giamGia;
    private double thue;

    // constructor
    public sanpham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public sanpham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    //set và get
//    tên sản phẩm
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
//đơn giá
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
//thuế nhập khẩu
    public double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void setThueNhapKhau(double thue) {
        this.thue = thue;
    }
  
    //method
    public void nhap() {

        System.out.print("Nhập tên sản phẩm:");
        this.tenSP = scan.nextLine();
        System.out.print("Nhập đơn giá:");
        this.donGia = scan.nextDouble();
        System.out.print("Nhập số giảm giá:");
        this.giamGia = scan.nextDouble();
    }
public double thueNhapKhau(){
    return this.thue=(this.donGia-this.giamGia)*0.1;
}
    public void xuat() {
        System.out.printf("Tên sản phẩm : %s.\n", tenSP);
        System.out.printf("Đơn giá:%.2f.\n", donGia);
        System.out.printf("Giảm giá:%.2f.\n", giamGia);
        System.out.printf("Thuế thu nhập:%.2f", this.getThueNhapKhau());

    }
}

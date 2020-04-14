package de1_mau;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class ngoai_thanh extends chuyen_xe {

    private String NoiDen;
    private int SoNgay;
    Scanner scan = new Scanner(System.in);

    public void setNoiDen(String noiDen) {
        NoiDen = noiDen;

    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setSoNgay(int soNgay) {
        SoNgay = soNgay;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public ngoai_thanh() {
        super();
        this.NoiDen = "";
        this.SoNgay = 0;
    }

    public ngoai_thanh(String ma, String name, String sx, double dt, String nd, int sn) {
        super(ma, name, sx, dt);
        this.NoiDen = nd;
        this.SoNgay = sn;

    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhập Nơi đến:");
        this.NoiDen = scan.nextLine();
        System.out.print("Nhập số ngày: ");
        this.SoNgay = scan.nextInt();

    }

    public String toString() {
        return "Chuyến xe ngoại thành :" + super.toString()
                + "\n Nơi đến: " + this.NoiDen 
                + "\n Số ngày: " + this.SoNgay;
    }

}

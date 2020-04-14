package de1_mau;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class chuyen_xe {

    protected String Macx, NameTX, SoX;
    protected double DoanhThu;
    Scanner scan = new Scanner(System.in);

    protected void setMacx(String macx) {
        Macx = macx;
    }

    protected String getMacx() {
        return Macx;
    }

    protected void setNameTX(String nameTX) {
        NameTX = nameTX;
    }

    protected String getNameTX() {
        return NameTX;
    }

    protected void setSox(String soX) {
        SoX = soX;
    }

    protected String getSoX() {
        return SoX;
    }

    protected void setDoanhThu(double doanhThu) {
        DoanhThu = doanhThu;
    }

    protected double getDoanhThu() {
        return DoanhThu;
    }

    protected chuyen_xe() {
        this.Macx = "";
        this.NameTX = "";
        this.SoX = "";
        this.DoanhThu = 0;
    }

    protected chuyen_xe(String ma, String name, String sx, double dt) {
        this.Macx = ma;
        this.NameTX = name;
        this.SoX = sx;
        this.DoanhThu = dt;

    }

    protected void nhap() {
        System.out.print("Nhập Mã số chuyến:");
        this.Macx = scan.nextLine();
        System.out.print("Nhập tên tài xế :");
        this.NameTX = scan.nextLine();
        System.out.print("Nhập số xe:");
        this.SoX = scan.nextLine();
        System.out.print("Nhập doanh thu : ");
        this.DoanhThu = scan.nextDouble();

    }

    public String toString() {
        return "\n Mã số chuyến: " + this.Macx
                + "\n Name tài xế: " + this.NameTX
                + "\n Số xe: " + this.SoX;
    }
}

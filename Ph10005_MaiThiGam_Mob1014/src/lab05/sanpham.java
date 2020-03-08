package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sanpham {

    private String tenSP;
    private double gia;
    Scanner scan = new Scanner(System.in);

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    

    public void nhap() {
        System.out.print("Nhập tên:");
        this.tenSP = scan.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.gia = Double.parseDouble(scan.nextLine());
    }

    public void xuat() {
         System.out.printf("Tên: %s", this.tenSP);
         System.out.printf("Đơn giá: %2.f", this.gia);
         
    }

   

}

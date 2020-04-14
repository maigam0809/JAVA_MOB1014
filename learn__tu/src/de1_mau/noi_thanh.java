package de1_mau;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class noi_thanh extends chuyen_xe{
    private double SoKm;
    private String SoTuyen;
    Scanner scan=new Scanner(System.in);
    
    public noi_thanh(){
        super();
        this.SoTuyen="";
        this.SoKm=0;
    }

    

    public noi_thanh(double sk, String st, String ma, String name, String sx, double dt) {
        super(ma, name, sx, dt);
        this.SoKm = sk;
        this.SoTuyen = st;
    }

    public double getSoKm() {
        return SoKm;
    }

    public void setSoKm(double SoKm) {
        this.SoKm = SoKm;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(String SoTuyen) {
        this.SoTuyen = SoTuyen;
    }
    
    public void nhap(){
        super.nhap();
        System.out.print("Nhập số km đi: ");
        this.SoKm=scan.nextDouble();
        this.SoTuyen=scan.nextLine();
        
    }
    public String toString(){
        return "Chuyến xe nội thành :" + super.toString()
                + "\n Số tuyến: " + this.SoTuyen 
                + "\n Số Km: " + this.SoKm;
    }

    
    
    
    
}

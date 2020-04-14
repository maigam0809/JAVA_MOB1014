package bai3;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class student {
     public String code;
    public String name;
    public String dia_chi;
    public int muc_uu_tien;
    Scanner scan=new Scanner(System.in);
    
    public student() {
       
    }

    public student(String code, String name, String dia_chi, int muc_uu_tien) {
        this.code = code;
        this.name = name;
        this.dia_chi = dia_chi;
        this.muc_uu_tien = muc_uu_tien;
    }
    
    public void nhap(){
        System.out.print("Nhập mã code : ");
        code=scan.nextLine();
        System.out.print("Nhập họ và tên: ");
        name=scan.nextLine();
        System.out.print("Nhập địa chỉ: ");
        dia_chi=scan.nextLine();
        System.out.println("Mức ưu tiên: ");
        muc_uu_tien=Integer.parseInt(scan.nextLine());
        
    }
    public void xuat(){
      
        
    }
}

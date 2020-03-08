package lab07.bai2_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import lab05.sanpham;

public class quan_li_sinh_vien {

    ArrayList<sinhVienPoLy> list = new ArrayList<sinhVienPoLy>();
    Scanner scan = new Scanner(System.in);
    int n;
// nhập sinh viên

    public void nhap() {
         System.out.println("===========Nhập số lượng sinh viên==============");
            n = Integer.parseInt(scan.nextLine());
        System.out.println("Mời bạn chọn sinh viên muốn hiển thị (1: sinh viên Biz)(2:sv IT).");

        int loaiNV = Integer.parseInt(scan.nextLine());
        if (loaiNV == 1) {
         
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhập sv thứ :%d.\n", i);
                System.out.println("Nhập tên:");
                String hoTen = scan.nextLine();
                System.out.println("Nhập diem marketting:");
                Double diemMarketing = Double.parseDouble(scan.nextLine());
                System.out.println("Nhập diem Sales:");
                Double diemSales = Double.parseDouble(scan.nextLine());
                sinhVienBiz sv1 = new sinhVienBiz(hoTen, diemMarketing, diemSales);
                list.add(sv1);
            }
        } else {

            for (int i = 0; i < n; i++) {
                System.out.printf("============Nhập sv thứ :%d.\n======", i);
                System.out.println("Nhập tên:");
                String hoTen = scan.nextLine();
                System.out.println("Nhập diem Java:");
                Double diemJava = Double.parseDouble(scan.nextLine());
                System.out.println("Nhập diem HTML:");
                Double diemHtml = Double.parseDouble(scan.nextLine());
                System.out.println("Nhập diem CSS:");
                Double diemCss = Double.parseDouble(scan.nextLine());
                sinhVienIT sv2 = new sinhVienIT(hoTen, diemJava, diemHtml, diemCss) {
                };
                list.add(sv2);
            }
        }
    }

    public void xuat() {
        System.out.printf("%-20s %-20s %-20s  %20s \n", "Họ tên: ", "Ngành: ", "Điểm:", "Học Lực:");
        for (sinhVienPoLy s : list) {
            s.output();
        }
    }
    public void xuatGioi(){
      System.out.printf("%-20s %-20s %-20s  %20s \n", "Họ tên: ", "Ngành: ", "Điểm:", "Học Lực:");
      for (sinhVienPoLy s : list) {
           if(s.getHocLuc().equalsIgnoreCase("Giỏi")){
               s.output();
               
        }
      }
    }
    public void sapxep() {

        Comparator<sinhVienPoLy> comp = new Comparator<sinhVienPoLy>() {
            @Override
            public int compare(sinhVienPoLy t, sinhVienPoLy t1) {
                return Double.valueOf(t.getDiem()).compareTo(Double.valueOf(t1.getDiem())); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Collections.sort(list, comp);
        xuat();

    }
}

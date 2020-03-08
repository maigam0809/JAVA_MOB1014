package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai3 {

    ArrayList<sanpham> list = new ArrayList<sanpham>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void Y01() {
        System.out.println("Nhập số lượng sản phẩm");
        n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            sanpham sp = new sanpham();
            sp.nhap();
            list.add(sp);
        }
    }

    //sap xep giam dan theo gia va xuat ra man hinh
    public void Y02() {
        Comparator<sanpham> comp = new Comparator<sanpham>() {
            @Override
            public int compare(sanpham o1, sanpham o2) {
                return Double.valueOf(o2.getGia()).compareTo(o1.getGia());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Danh sach sau khi sap xep:");
        this.xuatDanhSach();
    }
    // xuat danh sach
    public void xuatDanhSach(){
        System.out.printf("%-20s %-10s \n", "Tên: ", "Giá: ");
        for (sanpham s : list) {
            System.out.printf("%-20s %-10s \n", s.getTenSP(), s.getGia());
        }
    }

    public void Y03() {
        System.out.print("Nhập vào tên muốn tìm:");
        String ten = scan.nextLine();
        
        System.out.printf("%-20s %-10s \n", "Tên: ", "Giá: ");
        
        for (sanpham s : list) {
            if (s.getTenSP().equalsIgnoreCase(ten)) {
                list.remove(s);
            }
        }
        
        System.out.println("Danh sách sau khi xóa:");
        this.xuatDanhSach();
    }

    public void Y04() {
        double giaTB = 0;
        int size = list.size();
        for (sanpham sp : list) {
            giaTB += sp.getGia();
        }
        System.out.printf("Giá trung bình là: %.2f", giaTB / size);
    }
}

package lab05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;

public class sinhvien_bai2 {

    private String hoTen;
    private ArrayList<String> list = new ArrayList<>();

    public void nhap() {
        Scanner s = new Scanner(System.in);
        String qd;
        boolean yn = true;
        while (yn) {
            System.out.println("Mời bạn nhập họ tên:");
            this.hoTen = s.nextLine();
            list.add(this.hoTen);
            qd = s.nextLine();
            switch (qd) {
                case "Y":
                    yn = true;
                    break;
                case "N":
                    yn = false;
                    break;
                default:
                    System.out.println("Hãy nhập lại họ tên ");

//        Scanner s = new Scanner(System.in);
//        while (true) {
//            String x = s.nextLine();
//            list.add(x);
//            if (s.nextLine().equals("N")) {
//                break;
//            }
//        }
            }
        }
    }

    public void xuat() {
        System.out.println("Danh sách sinh viên vừa nhập");
        for (String x : list) {
            System.out.println(x);
        }

    }

    public void xuatNgauNhien() {
        // hoán đổi phần tử
        System.out.println("======================");
        System.out.println("Danh sách  SV ngẫu nhiên:");
        Collections.shuffle(list);
        this.xuat();

    }

    public void xuatDanhSachTangDan() {
        System.out.println("======================");
        System.out.println("Danh sách SV Tawng dần:");
        Collections.sort(list);
        this.xuat();
    }

    public void timVaXoaHoTen() {
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("Nhập họ tên muốn xóa :");
        Scanner s = new Scanner(System.in);
        this.hoTen = s.nextLine();
        for (String x : list) {
            if (x.equals(this.hoTen)) {
                list.remove(x);
            }
        }
        this.xuat();
    }
}

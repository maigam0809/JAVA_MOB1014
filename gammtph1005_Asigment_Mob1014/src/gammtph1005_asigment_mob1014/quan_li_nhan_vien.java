package gammtph1005_asigment_mob1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quan_li_nhan_vien {

    ArrayList<nhanVien> list = new ArrayList<nhanVien>();
    Scanner scan = new Scanner(System.in);
    int n;

// nhap nhan vien
//    public void Y01() {
//        System.out.println("=========== Nhập số lượng nhân viên=========");
//        n = Integer.parseInt(scan.nextLine());
//        System.out.println("Mời bạn chọn loại nhân viên bạn muốn nhập thông tin (1.hành chính  \t 2.Tiếp thị \t 3.Truong Phong.");
//        int loaiNV = Integer.parseInt(scan.nextLine());
//        if (loaiNV == 1) {
//
//            nhanVien hc = new nhanVien();
//
//            System.out.println("=========== Nhập số lượng nhân viên=========");
//            n = Integer.parseInt(scan.nextLine());
//            for (int i = 0; i < n; i++) {
//                nhanVien nv = new nhanVien();
//                nv.nhap();
//                list.add(nv);
//            }
//        } else if (loaiNV == 2) {
//            tiepThi tt = new tiepThi();
//            System.out.println("=========== Nhập số lượng nhân viên=========");
//            n = Integer.parseInt(scan.nextLine());
//            for (int i = 0; i < n; i++) {
//                nhanVien nv = new nhanVien();
//                nv.nhap();
//                list.add(nv);
//            }
//        } else {
//            truongPhong tp = new truongPhong();
//
//            System.out.println("=========== Nhập số lượng nhân viên=========");
//            n = Integer.parseInt(scan.nextLine());
//            for (int i = 0; i < n; i++) {
//                nhanVien nv = new nhanVien();
//                nv.nhap();
//                list.add(nv);
//            }
//        }
//    }
    public void Y01() {
        System.out.println("==========Mời bạn nhập số lượng nhân viên========");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ :%d" + (i + 1) + ":");
            System.out.println("Mời bạn chọn nhân viên muốn nhập : \t 1.Nhân viên Hành Chính \t 2.Nhân Viên Tiếp Thị \t 3.Nhân viên Trưởng Phòng");
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    nhanVien nv = new nhanVien();
                    nv.nhap();
                    list.add(nv);
                    break;
                case 2:
                    tiepThi tt = new tiepThi();
                    tt.nhap();
                    list.add(tt);
                    break;

                case 3:
                    truongPhong tp = new truongPhong();
                    tp.nhap();
                    list.add(tp);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại.");

            }
        }
    }
    // xuat nhan vien

    public void Y02() {
         System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ","Thu Nhập:", "Thuế TN:");
        for (nhanVien scan : list) {
            
            scan.xuat();
        }
    }

//tìm và nhập số sinh viên theo mã số nhân viên
    public void Y03() {
        scan.nextLine();
        System.out.println("Nhập mã số nhân viên muốn tìm :");
        String ma = scan.nextLine();
        System.out.println("===========Thông tin nhân viên muốn tìm =======");
         System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ","Thu Nhập:", "Thuế TN:");
        for (nhanVien scan : list) {
            if (scan.maNV.equalsIgnoreCase(ma)) {
                list.indexOf(scan);
                scan.xuat();
            }else{
                System.out.println("Không tìm thấy nhân viên.");
                
            }
        }
    }

// xóa  nhân viên theo mã nhập từ bàn phím
    public void Y04() {
        System.out.print("=========Nhập vào tên muốn tìm==========");
        String ma = scan.nextLine();

        int size = list.size();
        
        for (int i = 0; i < size; i++) {
            if (list.get(i).maNV.equalsIgnoreCase(ma)) {
                list.remove(list.get(i));
                break;
            }
        }
        System.out.println("================Danh sách sau khi xóa============");
        Y02();
    }

// cập nhật thông tin nhân viên theo mã nhập từ bàn phím
    public void Y05() {
        System.out.println("Thông tin nhân viên theo mã nhập là:");
        String ma = scan.nextLine();
        for (nhanVien scan : list) {
            if (scan.maNV.equalsIgnoreCase(ma)) {
                System.out.println("===========Mời bạn nhập lại thông tin =========");
                scan.nhap();
            }
        }
        Y02();
    }

// tìm các nhân viên theo khoảng lương nhập từ bàn phím
    public void Y06() {
        System.out.print("Nhập vào khoảng điểm min:");
        double min = Double.parseDouble(scan.nextLine());
        System.out.print("Nhập vào khoảng điểm max:");
        double max = Double.parseDouble(scan.nextLine());
         System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ","Thu Nhập:", "Thuế TN:");
        for (nhanVien scan : list) {
            if (scan.luong >= min && scan.luong<= max) {
                scan.xuat();
            }
        }
    }
//sắp xếp nhân viên theo họ tên

    public void Y07() {
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
                return t.hoTen.compareTo(t1.hoTen);
            }
        };
        Collections.sort(list, comp);
        Y02();
    }

// sắp xếp nhân viên theo thu nhập
    public void Y08() {
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
                return Double.valueOf(t.getThuNhap()).compareTo(Double.valueOf(t1.getThuNhap()));
            }
        };
        Collections.sort(list, comp);
        Y02();

    }
// xuất 5 nhân viên có thu nhập cao nhất

    public void Y09() {
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
                return Double.valueOf(t.getThuNhap()).compareTo(Double.valueOf(t1.getThuNhap()));
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        System.out.println("Xuất 5 sinh viên có thu nhập cao nhất là :");
//        int size = list.size();
        if (list.size() < 5) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).xuat();
               
            }

        }else{
            for (int i = 0; i < 5; i++) {
                list.get(i).xuat();
               
        }

    }
}
}

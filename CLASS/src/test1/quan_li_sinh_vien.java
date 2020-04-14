package test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luong
 */
public class quan_li_sinh_vien {

    ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void nhapDS() {
        System.out.println("Nhap so luong sinh vien :");
        n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("=========Nhap sinh vien thu : " + (i + 1) + "======");
            System.out.println("Moi ban chon lop sinh vien");
            System.out.println("1.Sinh vien");
            System.out.println("2.Sinh vien Nuoc Ngoai");
            int chon = scan.nextInt();
            switch (chon) {
                case 1:
                    SinhVien sv = new SinhVien();
                    sv.nhap();
                    list.add(sv);
                    break;
                case 2:
                    SinhVienNuocNgoai nn = new SinhVienNuocNgoai();
                    nn.nhap();
                    list.add(nn);
                    break;
                default:
                    System.out.println("Ban da chon sai. ");
                    System.out.println("Moi ban nhap lai.");

            }

        }

    }

    public void XuatDS() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", "Ma Sinh vien:", "Ho Ten", "Diem toan :", "Diem Van:", "Tong Diem :", "Xep loai:");
        for (SinhVien s : list) {
            s.xuat();
        }
    }

    public void TimKiem() {
        System.out.print("Nhap khoang diem min: ");
//        double min = Double.parseDouble(scan.nextLine());
          double min = scan.nextDouble();
        System.out.print("Nhap khoang diem max: ");
//        double max = Double.parseDouble(scan.nextLine());
           double max = scan.nextDouble();

        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", "Ma Sinh vien:", "Ho Ten", "Diem toan :", "Diem Van:", "Tong Diem :", "Xep loai:");
        for (SinhVien s : list) {
            if (s.diemToan >= min && s.diemToan <= max) {
                s.xuat();

            }
        }

    }

    public void Xoa() {
         scan.nextLine();
        System.out.println("Nhap ma sinh vien muon xoa");
        String ma = scan.nextLine();

//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "Ma Sinh vien:", "Ho Ten", "Diem toan :", "Diem Van:", "Tong Diem :", "Xep loai:");

        for (SinhVien s : list) {
            if (s.maSV.equalsIgnoreCase(ma)) {
                System.out.println(s.maSV);
                list.remove(s);
//                s.xuat();
            }
        }
        System.out.println("Thong tin nhan vien con lai la: ");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "Ma Sinh vien:", "Ho Ten", "Diem toan :", "Diem Van:", "Tong Diem :", "Xep loai:");
        for(SinhVien s:list){
            s.xuat();
        }
    }

}

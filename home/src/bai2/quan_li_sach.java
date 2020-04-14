package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luong
 */
public class quan_li_sach {

    ArrayList<tai_lieu> list = new ArrayList<tai_lieu>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void Them() {
        System.out.println("================Nhập số lượng===============");
        n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("==============Nhập quyển thứ : " + (i + 1) + "===========");
            System.out.println("==============Có 3 loại:===============");
            System.out.println("1.Sách");
            System.out.println("2.Báo");
            System.out.println("3.Tạp Chí.");
            System.out.println("================================================");
            int loai;  
            do {
                loai=Integer.parseInt(scan.nextLine());
                switch (loai) {
                    case 1:
                        sach s = new sach();
                        s.nhap();
                        list.add(s);
                        break;
                    case 2:
                        bao b = new bao();
                        b.nhap();
                        list.add(b);
                        break;
                    case 3:
                        tap_chi tc = new tap_chi();
                        tc.nhap();
                        list.add(tc);
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại: ");
                        break;
                }
            } while (loai <= 0 || loai > 3);
        }
    }

    public void XuatDanhSach() {
        System.out.printf("%-20s %-20s %-20s \n", "Mã Tài Liệu ", "Tên Nhà Sản Xuất", "Số phát hành");
        for (tai_lieu p : list) {
            p.xuat();
        }
    }

    public void Xoa() {
        System.out.println("Nhập mã tài liệu  bạn muốn xóa: ");
        String ma = scan.nextLine();

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).ma_Tai_Lieu.equalsIgnoreCase(ma)) {
                list.remove(list.get(i));
                break;
            }
        }
        System.out.println("===============Danh sách sau khi xóa ===========");
        XuatDanhSach();
    }

    public void HienThi() {
        XuatDanhSach();
    }

    public void TimKiem() {
        System.out.println("======Chọn  Tài liệu muốn hiển thị==========");
        System.out.println("1.Sách");
        System.out.println("2.Báo");
        System.out.println("3.Tạp chí");
        System.out.println("0.Thoát");
        System.out.println("=====================================");
        System.out.print("Mời bạn chọn : ");
        int kiem = 0;
        do {
            Integer.parseInt(scan.nextLine());
            switch (kiem) {
                case 1:
                    sach s = new sach();
                    for (int i = 0; i < n; i++) {
                        s.xuat();
                    }
                    break;
                case 2:
                    bao b = new bao();
                    for (int i = 0; i < n; i++) {
                        b.xuat();
                    }
                    break;
                case 3:
                    tap_chi tc = new tap_chi();
                    for (int i = 0; i < n; i++) {
                        tc.xuat();
                    }
                    break;
                case 0:
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Mời bạn nhập lại:");
                    break;
            }
        } while (kiem < 0 || kiem > 3);
    }
}

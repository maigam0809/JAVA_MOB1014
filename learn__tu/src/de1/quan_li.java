package de1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luong
 */
class quan_li {

    ArrayList<chuyen_xe> list = new ArrayList<chuyen_xe>();
    Scanner scan = new Scanner(System.in);
    int n;
  

    public void NhapDanhSach() {

        System.out.print("Nhập số lượng chuyến xe: ");
        n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("======Nhập thông tin chuyến thứ : " + (i + 1) + "======");
            System.out.println("====== Chuyến xe=======");
            System.out.println("1.Nội thành");
            System.out.println("2.Ngoại thành.");
            System.out.println("=======================");
            int loai;
            do {
                System.out.print("Mời bạn chọn: ");
                loai = Integer.parseInt(scan.nextLine());
                System.out.println("");
                switch (loai) {
                    case 1:
                        noi_thanh noi = new noi_thanh();
                        list.add(noi);
                        noi.nhap();
                        break;
                    case 2:
                        ngoai_thanh ngoai = new ngoai_thanh();
                        list.add(ngoai);
                        ngoai.nhap();
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại: ");
                        break;
                }

            } while (loai != 1 && loai != 2);

        }
    }

    public void XuatDanhSach() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n ", "Mã số xe", "Họ tên tài xế", "Số xe", "Số tuyến", "KM đi được", "Doanh thu", "Nơi đến", "Số ngày đi được");
        for (chuyen_xe s : list) {
            s.xuat();
        }
    }

    public void TongDoanhThu() {
        double sum1 = 0;
        double sum2 = 0;

        for (chuyen_xe s : list) {
            if (s instanceof noi_thanh) {

                sum1 += ((noi_thanh) s).doanh_thu;
            } else {
                sum2 += s.doanh_thu;
            }
        }

        System.out.println("Tống doanh thu của nội thành : " + sum1);
        System.out.println("Tổng doanh thu của ngoai thanh : " + sum2);

    }
}

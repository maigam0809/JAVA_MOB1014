package lab06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luong
 */
public class quan_li_san_pham {

    ArrayList<sanpham> list = new ArrayList<sanpham>();
    Scanner p = new Scanner(System.in);
    int n;

    public void nhap() {
        System.out.print("Nhap so luong san pham: ");
        n = Integer.parseInt(p.nextLine());

        for (int i = 0; i < n; i++) {
            sanpham sp = new sanpham();
            System.out.printf("--------Nhap san pham thu: %d--------\n", i);
            sp.nhap();
            list.add(sp);
        }

    }

    public void xuat() {
        System.out.printf("%-20s %-10s %10s \n", "Tên SP: ", "Đơn giá: ", "Hãng:");
        for (sanpham s : list) {
            if (s.getHang().equalsIgnoreCase("Nokia")) {
                s.xuat();
            }
        }
    }
}

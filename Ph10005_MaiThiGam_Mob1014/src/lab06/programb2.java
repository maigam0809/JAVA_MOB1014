/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class programb2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        quan_li_san_pham ql = new quan_li_san_pham();
        int chon;

        do {

            menu();
            chon = scan.nextInt();
            scan.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Nhập danh sách san pham.");
                    ql.nhap();
                    break;
                case 2:
                    System.out.println("Xuất danh sách san pham vừa nhập.");
                    ql.xuat();
                    break;
                case 0:
                    System.out.print("Thoát.\n");
                    System.exit(0);
                default:
                    System.out.print("Bạn đã nhập sai.\n");
                    break;
            }

            if (chon != 0) {
                chon = -1;
            }
        } while (chon < 0);
    }

    public static void menu() {
        System.out.println("+---------------Các chức năng----------------------+");
        System.out.println("1.Nhập danh sách san pham.");
        System.out.println("2.Xuất danh sách san pham vừa nhập.");
        System.out.println("0.Thoát.");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Mời bạn nhập chức năng bạn muốn : ");
    }
}

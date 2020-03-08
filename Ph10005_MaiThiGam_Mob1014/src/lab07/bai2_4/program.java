package lab07.bai2_4;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class program {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        quan_li_sinh_vien ql = new quan_li_sinh_vien();
        int chon;

        do {

            menu();
            chon = scan.nextInt();
            scan.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Nhập danh sách sinh viên");
                    ql.nhap();
                    break;
                case 2:
                    System.out.println("Xuất danh sách sinh viên vừa nhập.");
                    ql.xuat();
                    break;
                case 3:
                    System.out.println("Sắp xếp sinh viên có học lực giỏi.");
                    ql.sapxep();
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
        System.out.println("1.Nhập danh sách nhân viên.");
        System.out.println("2.Xuất danh sách nhân viên vừa nhập.");
        System.out.println("2.Sắp xếp sinh viên có học lực giỏi.");
        System.out.println("0.Thoát.");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Mời bạn nhập chức năng bạn muốn : ");
    }
}

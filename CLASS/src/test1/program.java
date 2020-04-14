package test1;

import java.util.Scanner;


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
                   
                    ql.nhapDS();
                    break;
                case 2:
                   
                    ql.XuatDS();
                    break;
                case 3:
                    ql.TimKiem();
                    break;
                case 4:    
                    ql.Xoa();
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
        System.out.println("1.Nhập danh sách sinh vien.");
        System.out.println("2.Xuất danh sách sinh vien vừa nhập.");
        System.out.println("3.Tìm kiếm sinh viên theo khoang diem.");
        System.out.println("4.Xóa sinh viên theo mã nhập vào.");
        System.out.println("0.Thoát.");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Mời bạn nhập chức năng bạn muốn : ");
    }
}

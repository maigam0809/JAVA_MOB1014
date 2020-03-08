package gammtph1005_asigment_mob1014;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        quan_li_nhan_vien ql = new quan_li_nhan_vien();
        int chon;

        do {
            menu();
            chon = scan.nextInt();
            scan.nextLine();

            switch (chon) {
                case 1:
                   
                    ql.Y01();
                    break;
                case 2:
                   
                    ql.Y02();
                    break;
                case 3:
                  
                    ql.Y03();
                    break;
                case 4:
                   
                    ql.Y04();
                    break;
                case 5:
                  
                    ql.Y05();
                    break;
                case 6:
                  
                    ql.Y06();
                    break;
                case 7:
                  
                    ql.Y07();
                    break;
                case 8:
                  
                    ql.Y08();
                    break;
                case 9:
                  
                    ql.Y09();
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
        System.out.println("3.Tìm kiếm nhân viên theo mã số sinh viên.");
        System.out.println("4.Xóa nhân viên theo mã nhập vào.");
        System.out.println("5.Cập nhật thông tin nhân viên theo mã nhập ");
        System.out.println("6.Tìm các nhân viên theo khoảng lương nhập .");
        System.out.println("7.Sắp xếp nhân viên theo họ tên ");
        System.out.println("8.Sắp xếp nhân viên theo thu nhập. ");
        System.out.println("9.Xuất 5 Nhân viên có thu nhập cao nhất. ");
        System.out.println("0.Thoát.");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Mời bạn nhập chức năng bạn muốn : ");
    }
}

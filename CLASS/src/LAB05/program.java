package LAB05;

import java.util.Scanner;
public class program {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        quan_li_SVPOLY ql = new quan_li_SVPOLY();
        int chon;

        do {
            menu();
            chon = scan.nextInt();
            scan.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Nhập danh sách sinh viên");
                    ql.Y01();
                    break;
                case 2:
                    System.out.println("Xuất danh sách sinh viên");
                    ql.Y02();
                    break;
                case 3:
                    System.out.println("Xuất danh sách sinh viên theo bảng điểm.");
                    ql.Y03();
                    break;
                case 4:
                    System.out.println("Tìm sinh viên theo họ tên");
                    ql.Y04();
                    break;
                case 5:
                    System.out.println("Tìm và sửa sinh viên theo họ tên");
                    ql.Y05();
                    break;
                case 6:
                    System.out.println("Tìm và xóa theo họ tên");
                    ql.Y06();
                            
                    break;
                case 7:
                    System.out.println("Sắp xếp theo điểm");
                    ql.Y07();
                    break;
                case 8:
                    System.out.println("Sắp xếp theo họ và tên");
                    ql.Y08();
                    break;
                case 0:
                    System.out.println("Thoát.\n");
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai.\n");
                    break;
            }
             if (chon != 0) {
                chon = -1;
            }
        } while (chon < 0);  
}
   public static void menu() {
        System.out.println("+---------------Các chức năng----------------------+");
        System.out.println("1.Nhập danh sách sinh viên.");
        System.out.println("2.Xuất danh sách sinh viên.");
        System.out.println("3.Xuất danh sách sinh viên theo bảng điểm.");
        System.out.println("4.Tìm sinh viên theo họ tên.");
        System.out.println("5.Tìm và sửa sinh viên theo họ tên");
        System.out.println("6.Tìm và xóa theo họ tên.");
        System.out.println("7.Sắp xếp theo điểm ");
        System.out.println("8.Sắp xếp theo họ và tên ");
        System.out.println("0.Thoát.");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Mời bạn nhập chức năng bạn muốn : ");
    }
}

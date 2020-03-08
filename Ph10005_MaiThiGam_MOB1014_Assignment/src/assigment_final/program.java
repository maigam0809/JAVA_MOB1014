package assigment_final;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        quan_li_nhan_vien ql = new quan_li_nhan_vien();
        int chon;

        do {
            menu();
            System.out.print("Nhập chức năng bạn muốn:");
            chon = scan.nextInt();

            switch (chon) {
                case 1:
                    Y01();
                    break;
                case 2:
                    Y02();
                    break;
                case 3:
                    Y03();
                    break;
                case 4:
                    Y04();
                    break;
                case 5:
                    Y05();
                    break;
                case 6:
                    Y06();
                    break;
                case 7:
                    Y07();
                    break;
                case 8:
                    Y08();
                    break;
                case 9:
                    Y09();
                    break;
                case 0:
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn đã nhập sai!");
                    break;

            }
        } while (chon < 0 || chon > 10);

    
}

public static void menu(){
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("1.Nhập danh sách nhân viên.");
    System.out.println("2.Xuất danh sách nhân viên.");
    System.out.println("3.Tìm và hiển thị nhân vien theo mã nhập.");
    System.out.println("4.Xoá nhân viên theo mã nhập .");
    System.out.println("5.Cập nhật thông tin nhân viên theo mã nhập");
    System.out.println("6.Tìm các nhân viên theo khoảng lương nhập."); 
    System.out.println("7.Sắp xếp nhân viên theo họ và tên.");
    System.out.println("8.Sắp xếp nhân viên theo thu nhập.");
    System.out.println("9.Xuất 5 sinh viên có thu nhập cao nhất.");
    System.out.println("0.Thoát.");
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

}

    private static void Y09() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y08() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y07() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y06() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y05() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y04() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y03() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y02() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Y01() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

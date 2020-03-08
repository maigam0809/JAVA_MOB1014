package lab05;

import java.util.Scanner;
public class program_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        bai3 ql = new bai3();
        int chon;

        do {
            menu();
            chon = scan.nextInt();
            scan.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Nhập danh sách sản phẩm");
                    ql.Y01();
                    break;
                case 2:
                    System.out.println("Xuất danh sách sản phẩm giảm dần");
                    ql.Y02();
                    break;
                case 3:
                    System.out.println("Tìm và xóa sản phẩm theo ten.");
                    ql.Y03();
                    break;
                case 4:
                    System.out.println("Tinh giá trung bình.");
                    ql.Y04();
                    break;
                case 0:
                    System.out.println("Thoát.\n");
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai.\n");
                    break;
            }
            if(chon != 0){
                chon = -1;
            }         
            
        } while (chon < 0);
    }

    public static void menu() {
        System.out.println("+---------------Các chức năng----------------------+");
        System.out.println("1.Nhập danh sách sản phẩm.");
        System.out.println("2.Sắp xếp giảm dần và xuất.");
        System.out.println("3.Tìm và xóa theo tên.");
        System.out.println("4.Tính giá trung bình.");
        System.out.println("0.Thoát.");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Mời bạn nhập chức năng bạn muốn : ");
    }

}

package nha_dat;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//Xây dựng một chương trình quản lí danh sách nhà đất :
//Thông tin gồm
//1.giao dịch đất:Mã giao dịch,ngày giao dịch(tháng,ngày ,năm),đơn giá,loại đất(A,B,C),diên tích
//-Loại b,c: tính tiền=diện tích* đơn giá;
//-loại a: tính tiền=diện tích*đơn giá*1,5;
//2.Giao dịch nhà : mã giao dịch,ngày tháng ,năm,đơn giá,loại nhà (cao câp, thường),diên tích
//-Loại cao cấp : tính tiền =diện tích*đơn giá;
//-Lọa thường: tính tiền =diện tích*đơn giá*0,9;
//Thực hiện các yêu cầu sau 
//1.Xây dựng các lớp kế thừa
//2. Nhập ,xuất danh sách giao dịch
//3.Tính tổng số lượng cho từng loại
//4.tính trung bình tiền của các giao dịch đất
//5.Xuất các giao dịch của tháng 9/2013
public class program {

    public static void main(String args[]) {
        quan_li_giao_dich ql = new quan_li_giao_dich();
        int chon;
        Scanner scan = new Scanner(System.in);

        do {
            menu();
            chon = Integer.parseInt(scan.nextLine());
            switch (chon) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Mời bạn chọn lại:");
                    break;
                }
            if (chon != 0) {
                chon = -1;
            }
        } while (chon < 0 || chon > 4);

    }

    public static void menu() {
        System.out.println("========================Menu===================");
        System.out.println("1.Nhập xuất danh sách giao dịch");
        System.out.println("2.Tính tổng số lượng cho từng loại.");
        System.out.println("3.Tính trung bình tiền của các giao dịch đất");
        System.out.println("4.Xuất các giao dịch của tháng 9/2013.");
        System.out.println("0.Thoát.");
        System.out.println("==============================================");
        System.out.println("Mời bạn chọn chức năng");
    }

}

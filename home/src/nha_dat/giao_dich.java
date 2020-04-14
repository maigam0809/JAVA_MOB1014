package nha_dat;

//Xây dựng một chương trình quản lí danh sách nhà đất :
import java.util.Scanner;

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
public class giao_dich {

    Scanner scan = new Scanner(System.in);

    public String ma_giao_dich;
    public int nam, thang, ngay;
    public double don_gia;
    public double dien_tich;

    public giao_dich() {

    }

    public giao_dich(String ma_giao_dich, int nam, int thang, int ngay, double don_gia, double dien_tich) {
        this.ma_giao_dich = ma_giao_dich;
        this.nam = nam;
        this.thang = thang;
        this.ngay = ngay;
        this.don_gia = don_gia;
        this.dien_tich = dien_tich;
    }

    public void nhap() {
        System.out.print("Nhập mã giao dịch: ");
        ma_giao_dich = scan.nextLine();

        System.out.print("Nhập tháng:  ");
        thang = Integer.parseInt(scan.nextLine());
        while (thang <= 0 || thang > 12);

        do {
            System.out.print("Nhập năm:");
            nam = Integer.parseInt(scan.nextLine());
        } while (nam <= 0);

        do {
            System.out.print("Nhập ngày: ");
            ngay = Integer.parseInt(scan.nextLine());
        } while (ngay <= 0 || ngay > 31);

        System.out.print("Nhập đơn giá : ");
        don_gia = Double.parseDouble(scan.nextLine());
        System.out.print("Nhập diện tích : ");
        dien_tich = Double.parseDouble(scan.nextLine());

    }

    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã Giao dịch", "Ngày ", "Tháng", "Năm", "Đơn giá", "Diện tích");
//        System.out.printf("%-20s %-20d %-20d %-20d %-20.1f %-20.1f ", ma_giao_dich, ngay, thang, nam, don_gia, dien_tich);

    }
}

package de1;

//Công ty du lịch V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
import java.util.Scanner;

// Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
// Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi được, doanh thu.
//Thực hiện các yêu cầu sau:
// Xây dựng các lớp với chức năng thừa kế.
// Viết chương trình quản lý các chuyến xe theo dạng cây thừa kế với các phương thức sau:
//- Nhập, xuất danh sách các chuyến xe (danh sách có thể dùng cấu trúc mảng).
//- Tính tổng doanh thu cho từng loại xe
public class chuyen_xe {

    Scanner scan = new Scanner(System.in);
    public String ma_so_chuyen;
    public String ho_ten_tai_xe;
    public int so_xe;
    public float doanh_thu;

    public chuyen_xe() {
    }

    public chuyen_xe(String ma_so_chuyen, String ho_ten_tai_xe, int so_xe, float doanh_thu) {
        this.ma_so_chuyen = ma_so_chuyen;
        this.ho_ten_tai_xe = ho_ten_tai_xe;
        this.so_xe = so_xe;
        this.doanh_thu = doanh_thu;
    }

    public void nhap() {
        System.out.print("Nhập mã số chuyến xe : ");
        ma_so_chuyen = scan.nextLine();
        System.out.print("Nhập Họ tên tài xế: ");
        ho_ten_tai_xe = scan.nextLine();
        System.out.print("Nhập Số xe: ");
        so_xe = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập doanh thu: ");
        doanh_thu = Float.parseFloat(scan.nextLine());
    }

    public void xuat() {

    }

}

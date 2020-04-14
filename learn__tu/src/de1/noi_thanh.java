package de1;

/**
 *
 * @author luong
 */
//Công ty du lịch V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
// Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
// Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi được, doanh thu.
//Thực hiện các yêu cầu sau:
// Xây dựng các lớp với chức năng thừa kế.
// Viết chương trình quản lý các chuyến xe theo dạng cây thừa kế với các phương thức sau:
//- Nhập, xuất danh sách các chuyến xe (danh sách có thể dùng cấu trúc mảng).
//- Tính tổng doanh thu cho từng loại xe
public class noi_thanh extends chuyen_xe {

    public int so_tuyen;
    public float so_km_di_duoc;

    public noi_thanh() {
    }

    public noi_thanh(int so_tuyen, float so_km_di_duoc, String ma_so_chuyen, String ho_ten_tai_xe, int so_xe, float doanh_thu) {
        super(ma_so_chuyen, ho_ten_tai_xe, so_xe, doanh_thu);
        this.so_tuyen = so_tuyen;
        this.so_km_di_duoc = so_km_di_duoc;
    }

    public void nhap() {
        super.nhap();
        //do {
            System.out.print("Nhập số tuyến : ");
            so_tuyen = Integer.parseInt(scan.nextLine());
            System.out.print("Nhập số km đi được : ");
            so_km_di_duoc = Float.parseFloat(scan.nextLine());
        //} while (so_tuyen <= 0 || so_km_di_duoc <= 0);

    }

    public void xuat() {
        super.xuat();
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n ", "Mã số xe", "Họ tên tài xế", "Số xe", "Số tuyến", "KM đi được", "Doanh thu", "Nơi đến", "Số ngày đi được");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n ", ma_so_chuyen, ho_ten_tai_xe, so_xe, so_tuyen, so_km_di_duoc, doanh_thu, " ", "");
    }

}

package de1;

//Công ty du lịch V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
// Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh thu.
// Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi được, doanh thu.
//Thực hiện các yêu cầu sau:
// Xây dựng các lớp với chức năng thừa kế.
// Viết chương trình quản lý các chuyến xe theo dạng cây thừa kế với các phương thức sau:
//- Nhập, xuất danh sách các chuyến xe (danh sách có thể dùng cấu trúc mảng).
//- Tính tổng doanh thu cho từng loại xe
public class ngoai_thanh extends chuyen_xe{
    public String noi_den;
    public int so_ngay_di_duoc;

    public ngoai_thanh() {
    }

    public ngoai_thanh(String noi_den, int so_ngay_di_duoc, String ma_so_chuyen, String ho_ten_tai_xe, int so_xe, float doanh_thu) {
        super(ma_so_chuyen, ho_ten_tai_xe, so_xe, doanh_thu);
        this.noi_den = noi_den;
        this.so_ngay_di_duoc = so_ngay_di_duoc;
    }
    
      public void nhap() {
        super.nhap();
        do {
            System.out.print("Nhập nơi đến : ");
            noi_den = scan.nextLine();
            System.out.print("Nhập số ngày đi được : ");
            so_ngay_di_duoc = Integer.parseInt(scan.nextLine());
        } while (so_ngay_di_duoc<=0);
    }

    public void xuat() {
        super.xuat();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n ", "Mã số xe", "Họ tên tài xế", "Số xe", "Số tuyến", "KM đi được", "Doanh thu", "Nơi đến", "Số ngày đi được");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n ", ma_so_chuyen, ho_ten_tai_xe, so_xe, "", "", doanh_thu, noi_den, so_ngay_di_duoc);
    }
    
}

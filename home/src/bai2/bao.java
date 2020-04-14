package bai2;

/**
 *
 * @author luong
 */
public class bao extends tai_lieu{
    public int ngay_Phat_Hanh;

    public bao() {
    }

    public bao(int ngay_Phat_Hanh, String ma_Tai_Lieu, String ten_Nha_Xuat_Ban, int so_Ban_Phat_Hanh) {
        super(ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh);
        this.ngay_Phat_Hanh = ngay_Phat_Hanh;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        // chưa kiểm tra và check được ngày .
        System.out.print("Nhập ngày phát hành : ");
        ngay_Phat_Hanh=Integer.parseInt(scan.nextLine());
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã Tài Liệu ", "Tên Nhà Sản Xuất", "Số bản phát hành","Tên tác giả","Số trang","Số phát hành","Tháng phát hành","Ngày phát hành");
        System.out.printf("%-20s %-20s %-20d %-20s %-20s %-20s %-20s %-20d \n", ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh,"","","","",ngay_Phat_Hanh);
        
    }
     
    
}

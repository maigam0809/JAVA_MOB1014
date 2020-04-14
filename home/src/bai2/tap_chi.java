package bai2;

/**
 *
 * @author luong
 */
//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.

public class tap_chi extends tai_lieu{
    public int so_Phat_Hanh;
    public int thang_Phat_Hanh;

    public tap_chi() {
    }

    public tap_chi(int so_Phat_Hanh, int thang_Phat_Hanh, String ma_Tai_Lieu, String ten_Nha_Xuat_Ban, int so_Ban_Phat_Hanh) {
        super(ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh);
        this.so_Phat_Hanh = so_Phat_Hanh;
        this.thang_Phat_Hanh = thang_Phat_Hanh;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhập số phát hành : ");
        so_Phat_Hanh=Integer.parseInt(scan.nextLine());
        do{
        System.out.print("Nhập Tháng phát hành :");
        thang_Phat_Hanh=Integer.parseInt(scan.nextLine());
        
        }while(thang_Phat_Hanh<0||thang_Phat_Hanh>12);
        
        
    }
    
   @Override
    public void xuat(){
        super.xuat();
         System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã Tài Liệu ", "Tên Nhà Sản Xuất", "Số bản phát hành","Tên tác giả","Số trang","Số phát hành","Tháng phát hành","Ngày phát hành");
        System.out.printf("%-20s %-20s %-20d %-20s %-20s %-20d %-20s %-20s \n", ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh,"","",so_Phat_Hanh,thang_Phat_Hanh,"");
        
    }
     
    
    
}

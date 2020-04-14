package gammtph10005_asigment_mob1014;

import java.util.Scanner;


public class truongPhong extends nhanVien{
    public double luongTranhNhiem;
//    Scanner scan = new Scanner(System.in); khoogn khai báo scan trong hàm con vì nó kế thừa từ cha rồi

    public truongPhong() {
    }

    public truongPhong(double luongTranhNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.luongTranhNhiem = luongTranhNhiem;
    }
    
    
    @Override// ghi đè phương thức thu nhập của nhân viên tiếp thị che giấu đi phương thức của lớp cha
    public Double getThuNhap(){
        return super.getThuNhap()+luongTranhNhiem;  
    }
    @Override // ghi đè phương thức nhập
    public void nhap(){
        super.nhap();
        System.out.print("Nhập lương trách nhiệm:");
        luongTranhNhiem=Double.parseDouble(scan.nextLine());
        
    }
}

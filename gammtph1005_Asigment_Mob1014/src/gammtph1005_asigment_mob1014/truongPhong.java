package gammtph1005_asigment_mob1014;

import java.util.Scanner;


public class truongPhong extends nhanVien{
    public double luongTranhNhiem;
    Scanner scan=new Scanner(System.in);

    public truongPhong() {
    }

    public truongPhong(double luongTranhNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.luongTranhNhiem = luongTranhNhiem;
    }
    
    
    @Override// ghi đè phương thức thu nhập
    public double getThuNhap(){
        return luong+luongTranhNhiem;  
    }
    @Override // ghi đè phương thức nhập
    public void nhap(){
        super.nhap();
        System.out.println("Nhập lương trách nhiệm:");
        luongTranhNhiem=Double.parseDouble(scan.nextLine());
        
    }
}

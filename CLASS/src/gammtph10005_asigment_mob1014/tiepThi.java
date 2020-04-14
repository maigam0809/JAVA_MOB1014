package gammtph10005_asigment_mob1014;

public class tiepThi extends nhanVien {

    protected double doanhSo;
    protected double hoaHong;

    public tiepThi() {
      
    }

    public tiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

  

    @Override
    public Double getThuNhap() {
        return super.getThuNhap() + (doanhSo * hoaHong) / 100;
    }
    
    @Override // ghi đè phương thức nhập
    public void nhap() {
        super.nhap();
        System.out.print("Nhập doanh số của nhân viên : ");
        doanhSo = Double.parseDouble(scan.nextLine());
        System.out.print("Nhập hoa hồng:");
        hoaHong = Double.parseDouble(scan.nextLine());
    }
    
    
}

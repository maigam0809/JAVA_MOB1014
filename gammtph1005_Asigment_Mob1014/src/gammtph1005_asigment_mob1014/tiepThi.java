package gammtph1005_asigment_mob1014;

public class tiepThi extends nhanVien {

    double doanhSo;
    double hoaHong;

    public tiepThi() {
    }

    public tiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override// ghi đè phương thức thu nhập
    public double getThuNhap() {
        return luong + (doanhSo * hoaHong) / 100;

    }
    @Override // ghi đè phương thức nhập
    public void nhap() {
        super.nhap();
        System.out.println("Nhập doanh số của nhân viên : ");
        doanhSo = Double.parseDouble(scan.nextLine());
        System.out.println("Nhập hoa hồng:");
        hoaHong = Double.parseDouble(scan.nextLine());
    }
}

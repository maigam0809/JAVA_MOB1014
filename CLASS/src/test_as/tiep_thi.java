package test_as;

/**
 *
 * @author luong
 */
public class tiep_thi extends nhan_vien{
    public double doanh_so;
    public double hoa_hong;

    public tiep_thi() {
    }

    public tiep_thi(double doanh_so, double hoa_hong, String ma_nhan_vien, String ho_ten, double luong) {
        super(ma_nhan_vien, ho_ten, luong);
        this.doanh_so = doanh_so;
        this.hoa_hong = hoa_hong;
    }
    
    @Override
    public Double getThuNhap(){
        return luong+doanh_so+hoa_hong;
    } 
    
    public void nhap(){
        super.nhap();
        System.out.print("Nhập doanh số: ");
        doanh_so=scan.nextDouble();
        System.out.print("Nhập hoa Hồng: ");
        hoa_hong=scan.nextDouble();
        
    }
    public void xuat(){
        super.xuat();
    }
}

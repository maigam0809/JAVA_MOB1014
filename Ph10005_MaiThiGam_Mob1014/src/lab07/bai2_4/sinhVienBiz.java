package lab07.bai2_4;

/**
 *
 * @author luong
 */
public class sinhVienBiz extends sinhVienPoLy{
    double diemMarketting;
    double diemSales;

    public sinhVienBiz(String hoTen,double diemMarketting, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
        
    }

    @Override
    public double getDiem() {
        return (diemMarketting*2+diemSales)/3;//To change body of generated methods, choose Tools | Templates.
    }
    
}

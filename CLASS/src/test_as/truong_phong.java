package test_as;


public class truong_phong extends nhan_vien {

    public Double trach_nhiem;

    public truong_phong() {
    }

    public truong_phong(double trach_nhiem, String ma_nhan_vien, String ho_ten, double luong) {
        super(ma_nhan_vien, ho_ten, luong);
        this.trach_nhiem = trach_nhiem;
    }
    

    @Override
    public Double getThuNhap() {
    return luong+trach_nhiem;
    
    }
    public void nhap(){
        super.nhap();
        System.out.print("Nhập lương trách nhiệm: ");
        trach_nhiem=scan.nextDouble();
        
    }
    public void xuat(){
        super.xuat();
    }
}

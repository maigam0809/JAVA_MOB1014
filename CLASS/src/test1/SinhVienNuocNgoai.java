package test1;

/**
 *
 * @author luong
 */
public class SinhVienNuocNgoai extends SinhVien {

    public double diemUuTien;

    public SinhVienNuocNgoai(double diemUuTien, String maSV, String hoTen, double diemToan, double diemVan) {
        super(maSV, hoTen, diemToan, diemVan);
        this.diemUuTien = diemUuTien;
    }

    SinhVienNuocNgoai() {

    }

    @Override
    public double getTongDiem() {
        return diemToan * 2 + diemVan + diemUuTien;
    }
@Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap diem uu tien : ");
        diemUuTien = Double.parseDouble(scan.nextLine());
    }
//@Override
//    public void xuat() {
//        super.xuat();
////        System.out.printf("%-20s %-20s %-20.1f %-20.1f %-20.1f %-20s %-20 ", maSV, hoTen, diemToan, diemVan, getTongDiem(), getXepLoai());
//         System.out.printf("Diem uu tien: %.1f",diemUuTien);
//       
//    }

}

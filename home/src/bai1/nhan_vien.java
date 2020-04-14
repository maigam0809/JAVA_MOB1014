package bai1;

/**
 *
 * @author luong
 */
public class nhan_vien extends can_bo {

    public String cong_viec;

    public nhan_vien() {

    }

    public nhan_vien(String cong_viec, String ho_ten, int age, String gioi_tinh, String dia_chi) {
        super(ho_ten, age, gioi_tinh, dia_chi);
        this.cong_viec = cong_viec;
    }

    @Override

    public void nhap() {
        super.nhap();
        System.out.print("Nhập công việc: ");
        cong_viec = scan.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
      
        System.out.printf("%-20s %-20d %-20s %-20s %-20s \n", ho_ten, age,gioi_tinh, dia_chi,cong_viec);     
    }

}

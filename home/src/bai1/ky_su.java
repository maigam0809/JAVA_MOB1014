package bai1;

/**
 *
 * @author luong
 */
public class ky_su extends can_bo {

    String nganh_dao_tao;
 public ky_su() {
       
    }
    public ky_su(String nganh_dao_tao, String ho_ten, int age, String gioi_tinh, String dia_chi) {
        super(ho_ten, age, gioi_tinh, dia_chi);
        this.nganh_dao_tao = nganh_dao_tao;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập ngành đào tạo: "); 
        nganh_dao_tao = scan.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
       System.out.printf("%-20s %-20d %-20s %-20s %-20s %-20s %-20s \n", ho_ten, age,gioi_tinh, dia_chi," ",nganh_dao_tao," ");    
    }

}

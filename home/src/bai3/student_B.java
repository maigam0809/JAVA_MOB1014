package bai3;

/**
 *
 * @author luong
 */
public class student_B extends student{

    public String khoi = "B";

    public student_B() {

    }

    public student_B(String khoi, String code, String name, String dia_chi, int muc_uu_tien) {
        super(code, name, dia_chi, muc_uu_tien);
        this.khoi = khoi;
    }
    public void nhap(){
        super.nhap();
    }
    public void xuat(){
        super.xuat();
//       System.out.printf("%-20s %-20s %-20s %-20s %-20s", "Mã code: ", " Họ và tên ", "Địa Chỉ :", " Mức ưu tiên ", "Khối: ");
        System.out.printf("%-20s %-20s %-20s %-20d %-20s \n", code, name, dia_chi, muc_uu_tien, khoi);
        
        
    }
    
    
   
}

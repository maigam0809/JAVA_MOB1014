package bai3;


public class student_C extends student{
    public String khoi="C";

    public student_C() {
        
    }

    public student_C(String code, String name, String dia_chi, int muc_uu_tien) {
        super(code, name, dia_chi, muc_uu_tien);
    }
    public void nhap(){
        super.nhap();
        
    }
    public void xuat(){
        super.xuat();
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s", "Mã code: ", " Họ và tên ", "Địa Chỉ :", " Mức ưu tiên ", "Khối: ");
        System.out.printf("%-20s %-20s %-20s %-20d %-20s \n", code, name, dia_chi, muc_uu_tien, khoi);
    }
    
    
    
    
    
     
    
    
}

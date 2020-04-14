package bai1;

/**
 *
 * @author luong
 */
public class cong_nhan extends can_bo{
    int bac;

    public cong_nhan() {
    }
     public cong_nhan(int bac, String ho_ten, int age, String gioi_tinh, String dia_chi) {
        super(ho_ten, age, gioi_tinh, dia_chi);
        this.bac = bac;
    }
     
    @Override
    public void nhap() {
        super.nhap();
        do{
            System.out.println("Nhập cấp bậc: ");
//            bac=scan.nextInt();
            bac=Integer.parseInt(scan.nextLine());
        }while(this.bac<=0||this.bac>10);           
    }  
    
    @Override
    public void xuat(){
        super.xuat();
       System.out.printf("%-20s %-20d %-20s %-20s %-20s %-20s %-20d \n", ho_ten, age,gioi_tinh, dia_chi," "," ",bac);   
    }
}

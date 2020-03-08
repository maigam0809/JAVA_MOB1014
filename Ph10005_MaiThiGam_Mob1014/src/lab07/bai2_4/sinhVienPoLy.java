package lab07.bai2_4;
 abstract public class sinhVienPoLy{
    public String hoTen;
     public String nganh;
     

    public sinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
        
    }
    
    public  abstract double getDiem();
    public String getHocLuc(){
        if(getDiem()<5){
            return "Yếu";
        }else if(getDiem()<6.5){
            return "TB";
        }else if(getDiem()<7.5){
            return "Khá";
        }else if(getDiem()<9){
            return "giỏi";
        }else{
            return "Xuất Sắc";
        }
    }
    public void output(){
        System.out.printf("%-20s %-20s %-20f %-20s\n",hoTen,nganh,getDiem(),getHocLuc());
    }
}
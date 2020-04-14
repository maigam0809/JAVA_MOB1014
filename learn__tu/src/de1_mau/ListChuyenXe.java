package de1_mau;

/**
 *
 * @author luong
 */

// lưu bằng cấu trúc mảng
public class ListChuyenXe {
   // int n;
    //private chuyen_xe[] CX=new chuyen_xe[n];
    private chuyen_xe[] CX=new chuyen_xe[100];
    private int countCX;
    private double sum1=0,sum2=0;
    
    
    public void ListCX(){
  //  System.out.println("Nhập số lượng chuyến xe: ");
    countCX=0;
    for(int i=0;i<100;i++){
        CX[i]=new chuyen_xe();
        
    }
    
    }
    public void listcx(int temp){
        if(countCX>100){
            System.out.println("Không thể thêm dữ liệu!");
            
        }
        else{
            if(temp==1){
                CX[countCX]=new noi_thanh();
                noi_thanh noit=new noi_thanh();
                noit.nhap();
                CX[countCX]=noit;
                sum1+=noit.getDoanhThu();
                
            }else{
                CX[countCX]=new ngoai_thanh();
                ngoai_thanh ngoait=new ngoai_thanh();
                ngoait.nhap();
                CX[countCX]=ngoait;
                sum2+=ngoait.getDoanhThu();
            }
            countCX++;
        }
        
    }
    
    public void xuat(){
        for(int i=0;i<countCX;i++){
           System.out.println("--------------/-------------/----------");
           System.out.println(CX[i].toString());
        }
        System.out.println("=============== Doanh Thu ==========");
        System.out.println("| chuyen xe ngoai thanh: "+sum2);
        System.out.println("| chuyen xe noi thanh: "+sum1);
        System.out.println("------------------------------------");
    }
        
    
}

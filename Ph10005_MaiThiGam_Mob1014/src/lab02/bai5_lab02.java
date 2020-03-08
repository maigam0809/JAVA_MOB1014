package lab02;
import java.util.Scanner;
public class bai5_lab02 {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        final float PI=3.14f;
        System.out.print("Nhập bán kính của hình tròn: ");
        float r=scan.nextFloat();
        float chuVi,dienTich;
        if(r<=0){
            System.out.print("Không có chu vi và diện tích của hình tròn.");
            
        }else{
            chuVi=2*PI*r;
            dienTich=PI*r*r;
            System.out.printf("Chu vi của hình tròn là : %.2f \n",chuVi);
            System.out.printf("Diện tích của hình tròn là : %.2f \n",dienTich);
        }
       
    }
    
}

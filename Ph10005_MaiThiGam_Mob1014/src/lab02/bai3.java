package lab02;


import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       System.out.printf("Tính số tiền điện.\n");
       System.out.print("Nhập số điện tiêu thụ :");
       int soDien=scan.nextInt();
       float tienDien;
       if(soDien<=50){
           tienDien=soDien*1000;
       }else{
           tienDien=50*1000+(soDien-50)*1200;
       }
       System.out.printf("Tiền điện phải trả là :%f.\n",tienDien);
        
    }
    
}

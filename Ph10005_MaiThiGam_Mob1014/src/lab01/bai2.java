package lab01;
import java.util.Scanner;
public class bai2 {
   public static void main (String[] args){
        Scanner a=new Scanner (System.in);
        System.out.println("Nhập chiều dài : ");
        int chieuDai=a.nextInt();
        System.out.print("Nhập chiều rộng :");
        int chieuRong=a.nextInt();
        int chuVi;
        chuVi=(chieuDai+chieuRong)*2;
        
        System.out.printf("Chu vi của hình chữ nhật là : %d",chuVi);
        int canhNhoNhat;
         canhNhoNhat= Math.min(chieuDai, chieuRong);
        System.out.printf("\nCanh nho nhat la:%d \n",canhNhoNhat );
        
    } 
}

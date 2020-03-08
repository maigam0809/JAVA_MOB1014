package LAB04;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class mang_lop {
     public static void main (String[] args){
        System.out.println("Mời bạn nhập mang nhan vien.\n");
        Scanner scan = new Scanner(System.in);
        
        int soNV;
        //check soSV
        do {
            System.out.println("Nhập số sv là : ");
            soNV = scan.nextInt();
            scan.nextLine();
        } while (soNV <= 0);
        
        employee []nv = new employee[soNV];
        //nhap nv
        for (int i = 0; i < soNV; i++){
            System.out.println("Nhập nv thứ " + (i+1) + ": ");
            nv[i] = new employee();
            nv[i].input();
        }
        
        //xuat nv
        System.out.println("Xuat Nhan Vien");
        for (int i = 0; i < soNV; i++){
            nv[i].output();
        } 
        
   
    }    
}

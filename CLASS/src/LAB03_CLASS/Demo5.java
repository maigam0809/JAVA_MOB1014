/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03_CLASS;

import java.util.Scanner;

/**
 *
 * @author DIAMOND
 */
public class Demo5 {
     public static void main(String[] args) 
    {
        //CÁC EM NHÌN VÀO ĐOẠN CODE SAU, NHẬP VÀO SÔ NGUYÊN AM HAY DƯƠNG?
        //ĐÔI VƠI DO WHILE ÍT NHẤT THỰC HIỆN ĐƯỢC 1 LẦN CÔNG VIỆC
        //ĐÔI VỚI BÀI TOÁN NÀY CHO PHÉP NHẬP SỐ NGUYÊN ÂM, 
        //VÒNG LẶP DỪNG LẠI KHI NHẬP SÔ DƯƠNG
        
        Scanner p=new Scanner(System.in);

       int so=0;
       do
       {
        System.out.print("Nhap gia tri so: ");
        so=p.nextInt();
       }
       while(so<0);

    }
}

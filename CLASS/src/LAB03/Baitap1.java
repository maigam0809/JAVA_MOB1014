/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03;

import java.util.Scanner;

/**
 *
 * @author DIAMOND
 */
public class Baitap1 {
     public static void main(String[] args) 
    {
         Scanner p=new Scanner(System.in);
         System.out.print("Nhap so nguyen duong: ");
         int n=p.nextInt();
         int i=2;
         boolean songuyento=true;
         for(i=2;i<n/2;i++)
         {
            if (n%i==0) 
            {
                songuyento=false;
                break;
            }
         }
         System.out.printf("so nhap vao co phai la so nguyen to? %s",songuyento);
         //cach 2
//         while((i<n) && (n%i!=0))
//         {
//            i++; 
//         }
//         if (i==n)
//         {
//             System.out.println("la so nguyen to");
//         }
//         else 
//         {
//             System.out.println("Khong phai so nguyen to");
//         }
//    
    }
}

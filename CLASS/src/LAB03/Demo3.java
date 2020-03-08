/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03;

import java.util.Scanner;
//BAI TẬP 
public class Demo3 {
    public static void main(String[] args) 
    {
        Scanner p=new Scanner(System.in);
        System.out.print("Nhap gia tri min: ");
        int min=p.nextInt();
        System.out.print("Nhap gia tri min: ");
        int max=p.nextInt();
        int i=min;
        int tong=0;
        while (i<=max)
        {
            tong=tong+i;
            i++;
        }
        
        System.out.println("Gia tri tong la: "+ tong);
    }
}

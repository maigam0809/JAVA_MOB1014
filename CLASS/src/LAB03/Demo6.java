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
public class Demo6 {
    public static void main(String[] args) 
    {
      Scanner p=new Scanner(System.in);
      int diem=0;
      while(true)
      {
          diem=p.nextInt();
          if(diem>=0&&diem<=10)
          {
             break;
          }
          System.out.println("Diem phai nhap tu 0 den 10");
      }
      
    }
}

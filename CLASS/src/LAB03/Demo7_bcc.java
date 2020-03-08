/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03;

/**
 *
 * @author DIAMOND
 */
public class Demo7_bcc {
   public static void main(String[] args) 
    {
        for (int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                int kq=i*j;
                System.out.printf("%d * %d =%d \t",i,j,kq);
            }
            System.out.println("\n\r");
             //System.out.println("\t");
        }
//        int i=1;
//        int kq;
//        while (i<=9)
//        {
//            int j=1;
//            while (j<=9)
//            {
//                kq=i*j;
//                j++;
//                System.out.printf("%d * %d =%d \t",i,j,kq);
//            }
//            i++;
//            System.out.println("\n\r");
//        }
//                
        
    } 
}

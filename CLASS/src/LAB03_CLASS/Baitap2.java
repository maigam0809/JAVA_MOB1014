/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03_CLASS;

/**
 *
 * @author DIAMOND
 */
public class Baitap2 {
     public static void main(String[] args) 
    {
        for (int i=1;i<=9;i++)
        {
            for(int j=1;j<=10;j++)
            {
                int kq=i*j;
                System.out.printf("%d * %d =%d \t",i,j,kq);
            }
            System.out.println("\n\r");
             //System.out.println("\t");
        }
    }
}

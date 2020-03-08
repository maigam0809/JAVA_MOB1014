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
public class Demo2 {
     public static void main(String[] args) {
        int i = 27;
        float dem = 0;
        float tong = 0;
        while (i <= 250) {

            if (i % 3 == 0) {
                dem = dem + 1;
                tong = tong + i;
            }
            i++;          
        }
        System.out.printf("gia tri trung binh cac so chia het cho 3 la %.2f ", tong / dem);
    }
}

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
public class Demo4_bcc {
    public static void main(String[] args) {
        int i = 2;
        int kq;
        //SỬ DỤNG 2 VÒNG LẶP WHILE
        //VÒNG NGOAI DÙNG CHO I( BẢNG CỦA CHƯƠNG NÀO)
        //VÒNG TRONG DÙNG CHO J: MÔI BẢNG NHÂN TỪ 1 ĐÊN 10
        while (i <= 8) {
            int j = 1;
            while (j <= 9) {
                kq = i * j;
                System.out.printf("%d * %d =%d \t", j, i, kq);
                j++;
            }
            i++;
            System.out.println("\n\r");
        }
    }

}

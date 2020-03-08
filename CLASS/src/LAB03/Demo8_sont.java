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
public class Demo8_sont {
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int n = p.nextInt();
        int i = 2;
        //CÁC EM CHÚ Ý NHÉ
        //SỐ NGUYÊN TỐ: CHIA HẾT CHO 1 VÀ CHÍNH NÓ
        //VẬY CÔ SẼ CHO I CHẠY TỪ 2 CHO TỚI I<N
        //DK: I<N VÀ N KHÔNG CHIA HẾT CHO I THÌ TĂNG I LÊN
        while ((i < n) && (n % i != 0)) {
            i++;
        }
        //THOÁT KHỎI WHILE NẾU I==N THÌ LÀ SÔ NGUYEN TÔ
        if (i == n) {
            System.out.println("la so nguyen to");
        } else {
            System.out.println("Khong phai so nguyen to");
        }
    }
//         while(i<so/2)
//         {
//             if(so%i==0)
//             {
//                 System.out.println("Khong phai so nguyen to");
//             }
//             else 
//             {
//                 i++;
//             }
//         }
//        System.out.println("la so nguyen to");
//    }

}

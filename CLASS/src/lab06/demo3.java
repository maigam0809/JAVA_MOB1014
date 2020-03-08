package lab06;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class demo3 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kt = "\\w+@\\w+(\\.\\w+){1,2}";
        System.out.println("Nhập email:");
        String email=scan.nextLine();
        while(email.matches(kt)==false)
            System.out.println("Bạn đã nhập sai.");
            System.out.println("Nhập lại email:");
                email=scan.nextLine();
   
            }
         

    }


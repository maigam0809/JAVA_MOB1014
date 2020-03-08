package LAB02;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class demo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a = scan.nextInt();

        System.out.print("Nhập số b");
        int b = scan.nextInt();

        System.out.print("nhập số c:");
        int c = scan.nextInt();

        /*
        if(a>b){
            if(b>c){
                System.out.printf("Số lớn nhất là : %d", b);
            }else{
                System.out.printf("Số lớn nhất là : %d", c);
            }

       
        }else{
            if(c>a){
                System.out.printf("Số lớn nhất là : %d", c);

            }else{
                System.out.printf("Số lớn nhất là : %d", a);

            }

        }
         */
        // cachs2:
        int max = a > b ? a : b;
        max = c > max ? c : max;
        // int max=(a>b&&a>c)?a:(b>c)?b:c;
    }
}

package lab02;


import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Giải Phương trình bậc nhất :a*x+b=0");
        System.out.print("Nhập a: ");
        int a = scan.nextInt();
        System.out.print("Nhập b: ");
        int b = scan.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình vô số nghiệm.\n");
            } else {
                System.out.print("Phương trình vô nghiệm.\n");
            }
        } else {
            System.out.printf("Phương trình có nghiệm là : x=%d \n", (-b / a));
        }
    }
}

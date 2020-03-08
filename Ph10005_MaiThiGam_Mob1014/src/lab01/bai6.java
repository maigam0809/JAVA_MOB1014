package lab01;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mời  bạn nhập vào một chuỗi:");
        String s1 = scan.nextLine();
        System.out.print("Nhập chuỗi thứ hai  : ");
        String s2 = scan.nextLine();
        System.out.printf("Chuỗi bạn vừa nhập là : %s \n", s1);
        System.out.printf("Chuỗi bạn nhập lần thứ hai là :%s\n", s2);
        System.out.printf("Hai chuỗi bạn vừa nhập là :%s %s", s1, s2);
    }
}

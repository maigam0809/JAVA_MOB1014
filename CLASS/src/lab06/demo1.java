package lab06;

import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hoTen;
        System.out.println("Nhập tên sinh viên:");
        hoTen = scan.nextLine();
        int n = hoTen.lastIndexOf("");
        int m = hoTen.indexOf("");
        int d = hoTen.length();
        String first = hoTen.substring(0, n).toUpperCase();
        String last = hoTen.substring(0, m).toUpperCase();
        String dem = hoTen.substring(n, m);
        System.out.printf("Họ: %s","Đệm:%s","Tên:%s",first,dem,last);
        
        
    
    
    
    }
}

package lab06;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

       
        
        Scanner scan = new Scanner(System.in);
        String hoTen;
        System.out.println("Nhập tên sinh viên:");

        hoTen = scan.nextLine();
        int n = hoTen.indexOf(" ");//thiếu dấu cách

        int m = hoTen.lastIndexOf(" ");
        int d = hoTen.length();

        String ho = hoTen.substring(0, n).toUpperCase();

        String dem = hoTen.substring(n+1, m);

        String ten = hoTen.substring(m+1).toUpperCase();

        System.out.printf("Họ: %s, Đệm:%s,Tên:%s", ho, dem, ten);
        //Mai Thi Gam

        //Hàm substring(index Đầu, index Cuối) trong đó chuỗi = từ index đầu < index cuối
    }
}

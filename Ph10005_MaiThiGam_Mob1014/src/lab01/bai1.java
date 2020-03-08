package lab01;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner a=new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String hoTen=a.nextLine();
        System.out.println("Điểm TB: ");
        Double diemTB=a.nextDouble();
        System.out.printf("%s %.2fđiểm",hoTen,diemTB);
    }
    
}

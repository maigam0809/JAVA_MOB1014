package lab02;

import java.util.Scanner;

public class bai6_lab02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scan.nextLine();
        System.out.print("Nhập điểm toán: ");
        float toan = scan.nextFloat();
        System.out.print("Nhập điểm lý: ");
        float ly = scan.nextFloat();
        System.out.print(" Nhập điểm hóa : ");
        float hoa = scan.nextFloat();
        float tb = ((toan + ly + hoa) / 3);
        if ((toan < 0 || toan > 10) && (ly < 0 || ly > 10) && (hoa < 0 || hoa > 10)) {
            System.out.printf("Bạn đã nhập sai diem cua : %s",hoTen );
        } else {
            System.out.printf("Họ tên của sinh viên đó là: %s \n",hoTen );
            System.out.printf("Điểm trung bình của ba môn toán ,lý ,hóa là : %.1f \n", tb);

        }

    }

}

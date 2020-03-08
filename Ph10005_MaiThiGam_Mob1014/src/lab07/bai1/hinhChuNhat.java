package lab07.bai1;

import java.util.Scanner;

public class hinhChuNhat {

    double dai;
    double rong;
    Scanner scan = new Scanner(System.in);

    public hinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;

    }

    public void nhap() {
        do {
            System.out.println("Nhập chiều dài:");
            dai = scan.nextDouble();
            System.out.println("Nhập chiều rộng:");
            rong = scan.nextDouble();
        } while (dai < rong);
    }

    public void xuat() {
        double chuVi, dienTich;
        chuVi = (dai + rong) * 2;
        dienTich = dai * rong;
        System.out.printf("%-20s %-20s %-20s  %20s \n", "Chiều dài ", "chiều rộng", "chu vi", "Diện tích :");
        System.out.printf("%-20f %-20f %-20f  %20f \n", dai, rong, chuVi, dienTich);

    }
}

package lab03;

import java.util.Scanner;;
import java.util.Arrays;
public class bai3_sắp_xếp_thường {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scan.nextInt();
        } while (n < 0);
        // khởi tạo và cấp phát bộ nhớ cho mảng
        int a[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng. ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            a[i] = scan.nextInt();
        }
        //hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+"\t");
        }
        Arrays.sort(a);
        // sắp xếp mảng vừa nhập theo chiều giảm dần là :
        System.out.print("\n Mảng được sắp xếp là : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%5d", a[i]);
        }
        // in ra giá trị lớn nhất khi nhấp vào màn hình 
        int maxValue = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }
        System.out.printf("\n Giá Trị Lớn Nhất của mảng vừa nhập là : %5d", maxValue);
        int bienDem = 0;
        int tong = 0;
        float tb;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                bienDem++;

            }
        }
        tb =(float)tong / bienDem;
        System.out.printf("\n Tb =%.1f.\n", tb);
     }
}

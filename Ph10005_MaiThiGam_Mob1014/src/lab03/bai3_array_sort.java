package lab03;

import java.util.Scanner;

public class bai3_array_sort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scan.nextInt();
        } while (n < 0);
        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng. ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scan.nextInt();
        }
        //hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        // Sap xep dung thuat toan sap xep chon
        int tg;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    // Hoan vi 2 so a[i] va a[j]
                    tg = array[i];
                    array[i] = array[j];
                    array[j] = tg;

                }
            }
        }
        // sắp xếp mảng vừa nhập theo chiều giảm dần là :
        System.out.print("\n Mảng được sắp xếp là : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%5d", array[i]);
        }
        // in ra giá trị lớn nhất khi nhấp vào màn hình 
        int maxValue = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.printf("\n Giá Trị Lớn Nhất của mảng vừa nhập là : %5d", maxValue);
        int bienDem = 0;
        int tb, tong = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                tong += array[i];
                bienDem++;

            }
        }
        tb = (tong / bienDem);
        System.out.printf("\n Giá trị trung bình của các số chia hết cho 3 là :%5d", tb);
    }
}

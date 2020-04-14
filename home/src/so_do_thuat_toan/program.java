package so_do_thuat_toan;

import java.util.Scanner;

public class program {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chon = scan.nextInt();
        while (true) {
            switch (chon) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    break;

            }
        }
    }

    void menu() {
        System.out.println("===========Các chức năng ===========");
        System.out.println("1.Tính S S=1+2+3+...+n");
        System.out.println("1.Tính S(n) = 12 + 22 + 32 + … + n2.");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");
        System.out.println("1.Tính tổng S=1+2+3+...+n");

    }

    void Y01() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += i;
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y02() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += Math.pow(i, 2);
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y03() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += (1 / n);
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y04() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += (1 / (2 * i));
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y05() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += (1 / (2 * i + 1));
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y06() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += (1 / i * x * (i + 1));
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y07() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += (i / (i + 1));
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y08() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += ((2 * i + 1) / (2 * i + 2));
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y09() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double giaithua = 1;
        for (int i = 0; i < n; i++) {
            giaithua *= i;
        }
        System.out.printf("Tổng = %.1f", giaithua);

    }

    void Y10() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số  x cần tính:");
        int x = scan.nextInt();

        double mu = 1;
        for (int i = 0; i < n; i++) {
            mu *= x;
        }
        System.out.printf("Tổng = %.1f", mu);

    }

    void Y11() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();

        double tong = 0;
        double tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= i;
            tong += tich;
        }
        System.out.printf("Tổng = %.1f", tong);

    }

    void Y12() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += Math.pow(x, i);
        }
        System.out.printf("Tổng = %.1f", tong);
    }

    void Y13() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;

        for (int i = 0; i < n; i++) {
            tong += Math.pow(x, (2 * i));
        }
        System.out.printf("Tổng = %.1f", tong);
    }

    void Y14() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += Math.pow(x, (2 * i + 1));
        }
        System.out.printf("Tổng = %.1f", tong);
    }

    void Y15() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;
        double S = 0;
        for (int i = 0; i < n; i++) {
            S += i;
            tong += (1 / S);
        }
        System.out.printf("Tổng = %.1f", tong);
    }

    void Y16() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;
        double S = 0;
        for (int i = 0; i < n; i++) {
            S += i;
            tong += (Math.pow(x,i)/ S);
        }
        System.out.printf("Tổng = %.1f", tong);
    }
    void Y17() {
        System.out.println("Nhập số  cần tính:");
        int n = scan.nextInt();
        System.out.println("Nhập số x cần tính:");
        int x = scan.nextInt();

        double tong = 0;
        double S = 0;
        for (int i = 0; i < n; i++) {
            S += i;
            tong += (Math.pow(x,i)/ S);
        }
        System.out.printf("Tổng = %.1f", tong);
    }
    

}

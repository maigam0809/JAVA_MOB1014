package lab08;

import java.io.PrintStream;
import java.util.Scanner;

public class lab08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Tổng: %.1f. \n", xPoly.sum(3, 5, 7, 9));
        System.out.printf("Max:%.1f.\n", xPoly.max(3, 5, 7, 9));
        System.out.printf("Min:%.1f.\n", xPoly.min(3, 5, 7, 9));
        System.out.printf("Chữ hoa : %s ", xPoly.toUpperFisrtChar("mai thị tấm"));
    }
}

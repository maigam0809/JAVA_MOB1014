package lab01;
import java.util.Scanner;
public class bai3 {
     public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Nhập một cạnh của hình lập Phương: ");
        double canh=a.nextInt();
        System.out.printf ("Thể tích hình lập phương là: %s \n",(canh*canh*canh));
        System.out.printf ("Thể tích HLP là : %s\n",Math.pow(canh,3));
    }
}

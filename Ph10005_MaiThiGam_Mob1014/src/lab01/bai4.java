package lab01;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.println("Giải phương trình bậc hai : a*x*x+bx+c=0");
            System.out.print("Nhập a: ");
            int a=scan.nextInt();
            System.out.print("Nhấp số b: ");
            int b=scan.nextInt();
            System.out.print("Nhập số c: ");
            int c=scan.nextInt();
            double denta;
            denta=b*b-4*a*c;
            if(denta<=0){
                System.out.printf ("Khong co denta.");
            }else{
            System.out.printf ("Denta là :%s\n ",denta);
            System.out.printf ("Căn Denta là : %s\n",Math.sqrt(denta));
            }
}
}

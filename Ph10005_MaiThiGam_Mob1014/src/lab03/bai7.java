package lab03;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a=scan.nextInt();
        System.out.print("Nhập số a:");
        int b=scan.nextInt();
        
        if(a==0||b==0){
           System.out.printf("UCLN là :%d",a+b);
        }
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        System.out.printf("UCLN là %d", a);
    }
}


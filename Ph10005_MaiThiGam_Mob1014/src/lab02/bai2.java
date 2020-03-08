package lab02;


import java.util.Scanner;
public class bai2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.printf("Giải Phương trình bậc hai: a*x*x+b*x+c=0.\n ");
        System.out.print("Nhập a: ");
        int a=scan.nextInt();
        System.out.print("Nhập b: ");
        int b=scan.nextInt();
        System.out.print("Nhập c: ");
        int c=scan.nextInt();
        double denta;
        denta=b*b-4*a*c;
        double x1,x2;
        x1=((-b+Math.sqrt(denta))/(2*a));
        x2=((-b-Math.sqrt(denta))/(2*a));
        if(a==0){
            if (b==0){
                if(c==0){
                    System.out.print("Phương trình vô số nghiêm.\n");
                    
                }else{
                    System.out.print("Phương trình vô nghiệm.\n");
                }
            }else{
                System.out.printf("Phương trình có nghiệm là:\n x=%d ",(-c/b));
            }
        }else {
           if(denta<0){
               System.out.print("Phương trình vô ngiệm.\n");
           }else if(denta==0){
               System.out.printf("Phương trình có nghiệm kép là :\n x=%s ",(-b/(2*a)));
           }else{
               System.out.printf ("Phương trình có hai ngiệm là: \n x1= %s\n x2=%s \n",x1,x2);
           }
        }
    }
}

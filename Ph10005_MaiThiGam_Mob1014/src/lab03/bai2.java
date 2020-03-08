
package lab03;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int x;
        do{System.out.print("Nhâp bảng cửu chương:");
            x=scan.nextInt();
        }while(x<=0);
        
        System.out.printf("Bảng cửu chương số %d là :",x);
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d.\n",x,i,x*i);
        }
        System.out.printf("Bảng cửu chương từ %d-9. \n",x);
        for(int i=1;i<=9;i++){
            System.out.printf("Bảng cửu chương số %d là:\n",i);
            for(int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d .\n",i,j,i*j);
            }
        }
    }
}

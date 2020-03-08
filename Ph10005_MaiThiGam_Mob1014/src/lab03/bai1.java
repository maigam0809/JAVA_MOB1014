package lab03;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("TÌm số nguyên tố.\n");
        System.out.print("Nhập số : ");
        int n=scan.nextInt();
        if(n<2){
            System.out.printf("%d:Không phải số nguyên tố.",n);
        }
        int bienDem=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            bienDem++; 
        }
        }
        if(bienDem==0){
            System.out.printf("%d: Là số nguyên tố.\n",n);
        }
        else{
        System.out.printf("%d:Không là số nguyên tố.\n",n);
        }    
    }
    
}


package lab03;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhâp số:");
        int n=scan.nextInt();
        
        int S1=0;int S2=0; int S3=0;
        for(int i=1;i<=n;i++){
            S1+=i;
            S2+=(Math.pow((-1),i))*i;
            S3+=2*i;
        }
        System.out.printf("S1= %d ,S2=%d ,S3=%d",S1,S2,S3);
    }
    
}

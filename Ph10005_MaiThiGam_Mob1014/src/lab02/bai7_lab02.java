package lab02;

import java.util.Scanner;

public class bai7_lab02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên có ba chữ số : ");
        int n = scan.nextInt();
        
        if (n % 2 == 0) {
            System.out.printf("Số %d là số chẵn.",n);

        } else {
            System.out.printf("Số %d là số lẻ.", n);
        }
        if(n>0){
            System.out.printf("\nSố %d là số dương ",n);
            
        }else{
            System.out.printf("\nSố %d là số âm.",n);
            
        }
     
        int dau;
        int cuoi;
        dau=n/100;
        cuoi=n%10;
        
        if(n>0){
            System.out.printf("%d là số nguyên dương.\n",n);
        }else{
            System.out.printf("%d là số nguyên âm.\n",n);
        }
        System.out.printf("%d là số đầu của %d.\n",dau,n);
        System.out.printf("%d là số cuoi cua %d.\n",cuoi,n);
        
        
        
    }
}



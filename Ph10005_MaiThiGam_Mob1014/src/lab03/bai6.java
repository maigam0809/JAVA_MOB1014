package lab03;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhâp số tien có là :");
        int tien=scan.nextInt();
        System.out.print("Nhập số tiền hàng hóa : ");
        int dongia=scan.nextInt();
        int soluong=0;
        while(tien>=dongia){
            soluong++;
            tien=tien-dongia;
            int chi=dongia-soluong;
            System.out.printf("Số tiền:%d , số lượng: %d",tien,soluong);
        }     
    }
}

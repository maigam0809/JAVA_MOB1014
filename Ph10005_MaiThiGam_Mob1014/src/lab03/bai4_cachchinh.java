package lab03;

import java.util.Scanner;

public class bai4_cachchinh {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soSV;// khai báo số sinh viên nhập vào

        // kiểm tra số sinh viên có aamhay không 
        //nếu âm thì nhập lại 
        do {
            System.out.println("Nhập số sinh viên :");
            soSV = scan.nextInt();
            scan.nextLine();
        } while (soSV < 0);
        // mang chua ho ten sinh vien
        String a[] = new String[soSV];
        //mang chua diem cua sinh vien
        float b[] = new float[soSV];
        String hocLuc[] = new String[soSV]; //nhap mang
        
        for (int i = 0; i < soSV; i++) {
            System.out.println("-Nhập sv thứ " + (i + 1) + ": ");
            System.out.print("+Ten sv: ");
            a[i] = scan.nextLine();
             
            
            System.out.print("+Diem sv: ");
            b[i] = scan.nextFloat();
            scan.nextLine();
            
        }
        // xuất sinh viên có họ tên và điểm và cps học lực là :
        
        for (int i = 0; i < soSV; i++) {
            if (b[i] >= 9) {
                hocLuc[i] = "Xuất Sắc";
            } else if (b[i] >= 7.5 && b[i] < 9) {
                hocLuc[i] = "Giỏi";

            } else if (b[i] >= 6.5 && b[i] < 7.5) {
                hocLuc[i] = "Khá";

            } else if (b[i] >= 5 && b[i] < 6.5) {
                hocLuc[i] = "Trung Bình";

            } else {
                hocLuc[i] = "Yếu";

            }
        }
        for(int i=0;i<soSV;i++){
            System.out.printf(" Sinh viên %d có :Họ tên :%s ,Điểm: %.2f ,Học lực:%s .\n",i + 1 ,a[i], b[i],hocLuc[i]);
        }
        // sắp xếp sinh viên theo danh sách điểm 
        for (int i = 0; i < soSV - 1; i++) {
            for (int j = i + 1; j < soSV; j++) {
                if (b[i] > b[j]) {
                    float tg1;
                    // Hoan vi 2 so b[i] va b[j]
                    tg1 = b[i];
                    b[i] = b[j];
                    b[j] = tg1;
                    // doi ho ten
                    String tg2=a[i];
                    a[i]=a[j];
                    a[j]=tg2;
                    // doi hoc luc
                    String tg3=hocLuc[i];
                    hocLuc[i]=hocLuc[j];
                    hocLuc[j]=tg3;
                }
            }
        }
        // sắp xếp mảng vừa nhập theo chiều giảm dần là :
        System.out.println("\n Mảng sinh viên được sắp xếp theo chiều tăng dần theo điểm  là : ");
        for (int i = 0; i < soSV; i++) {
            System.out.printf(" Sinh viên thứ %d có -Họ tên :%s ,Điểm: %.2f,Học lực:%s.\n "
                    ,i + 1 ,a[i], b[i],hocLuc[i]);
        }

    }
}

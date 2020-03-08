package lab03;

import java.util.Scanner;

public class bai4_phu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// luồng nhập vào 

        System.out.print("Mời bạn nhập họ và tên và điểm của sinh viên .\n");
        int soSV;

        //check soSV
        do {
            System.out.print("Nhập số sv là : ");
            soSV = scan.nextInt();
            scan.nextLine();
        } while (soSV < 0);

        // mang chua ho ten sinh vien
        String a[] = new String[soSV];
        //mang chua diem cua sinh vien
        float b[] = new float[soSV];

        //nhap mang
        for (int i = 0; i < soSV; i++) {
            System.out.println("-Nhập sv thứ " + (i + 1) + ": ");
            System.out.print("+Ten sv: ");
            a[i] = scan.nextLine();

            System.out.print("+Diem sv: ");
            b[i] = scan.nextFloat();
            scan.nextLine();
        }
        // xuất sinh viên có họ tên và điểm và cps học lực là :
        System.out.println("\nSinh viên có họ  tên và điểm là : ");
        for (int i = 0; i < soSV; i++) {
            if (b[i] >= 9) {
                System.out.printf("%s được %f và là học sinh xuất sắc.\n", a[i], b[i]);
            } else if (b[i] >= 7.5 && b[i] < 9) {
                System.out.printf("%s được %f và là học sinh giỏi.\n", a[i], b[i]);

            } else if (b[i] >= 6.5 && b[i] < 7.5) {
                System.out.printf("%s được %f và là học sinh khá.\n", a[i], b[i]);
            } else if (b[i] >=5&& b[i] < 6.5) {
                System.out.printf("%s được %f và là học sinh TB.\n", a[i], b[i]);
            } else {
                System.out.printf("%s được %f và là học sinh yếu.\n", a[i], b[i]);
            }
        }
        // sắp xếp sinh viên theo danh sách điểm 
        for (int i = 0; i < soSV - 1; i++) {
            for (int j = i + 1; j < soSV; j++) {
                if (b[i] >b[j]){
                    float tg;
                    // Hoan vi 2 so b[i] va b[j]
                    tg = b[i];
                    b[i] = b[j];
                    b[j] = tg;
                    // đổi họ tên sinh viên
                    String tg2=a[i];
                    a[i]=a[j];
                    a[j]=tg2;
                    //đổi hoc lực
                }
            }
        }
        // sắp xếp mảng vừa nhập theo chiều giảm dần là :
        System.out.println("\n Mảng được sắp xếp theo chiều tăng dần theo điểm  là : ");
        for (int i = 0; i<soSV; i++){
            System.out.printf("%s  là sinh viên sếp thứ %d được %f điểm.\n", a[i],i+1,b[i]);
        }
    }
}

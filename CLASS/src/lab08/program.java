package lab08;

import java.util.Scanner;



public class program {
    public static void main(String[] args) {
        int choose;
        Scanner s = new Scanner(System.in);
        XPoly a = new XPoly();
        a.menu();
        do{
            System.out.printf("Mời bạn nhập chức năng bạn muốn ");
            choose = Integer.parseInt(s.nextLine());
            
            switch(choose){
                case 1:{
                    System.out.print("Mời bạn nhập số lượng: ");
                    int n = Integer.parseInt(s.nextLine());
                    double array[] = new double[n];
                    for(int i = 0; i < n; i++){
                        System.out.printf("Tham số thứ %d: ", i +1);
                        array[i] = Double.parseDouble(s.nextLine());
                    }
                    System.out.printf("Tổng các tham số là  : %.1f\n", a.sum(array));
                    break;
                }
                case 2:{
                    System.out.print("Mời bạn nhập số lượng  : ");
                    int n = Integer.parseInt(s.nextLine());
                    double array[] = new double[n];
                    for(int i = 0; i < n; i++){
                        System.out.printf("Tham số thứ %d: ", i +1);
                        array[i] = Double.parseDouble(s.nextLine());
                    }
                    System.out.printf("MAX là : %.1f\n", a.max(array));
                    System.out.printf("MIN là : %.1f\n", a.min(array));
                    break;
                }
                case 3:{
                    System.out.print("Mời bạn nhập vào chuỗi: ");
                    String n = s.nextLine();
                    System.out.printf("Chữ hoa là : %s\n", a.toUpperFirstChar(n));
                    break;
                }
                case 4:{
                    System.out.println("Thoát.");
                    System.exit(0);
                    break;
                }
            }
        }while(choose != 4);
    }
}



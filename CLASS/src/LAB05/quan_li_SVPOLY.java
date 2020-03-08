package LAB05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class quan_li_SVPOLY {

    ArrayList<sinhVienPoly> list = new ArrayList<sinhVienPoly>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void Y01() {
        System.out.println("Nhập số lượng sinh viên");
        n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            sinhVienPoly sv = new sinhVienPoly();
            System.out.printf("Nhập sinh viên thứ :%d", i);
            System.out.print("Nhập tên:");
            sv.hoTen = scan.nextLine();
            System.out.print("Nhập điểm: ");
            sv.diemTB = Double.parseDouble(scan.nextLine());
            list.add(sv);

        }
    }

    
    public void Y02() {
        System.out.printf("%-20s %-10s \n", "Họ tên: ", "Điểm Tb: ");
        for (sinhVienPoly s : list) {
            System.out.printf("%-20s %-10s \n", s.hoTen, s.diemTB);
        }
    }

    public void Y03() {
        System.out.print("Nhập vào khoảng điểm min:");
        double min = Double.parseDouble(scan.nextLine());
        System.out.print("Nhập vào khoảng điểm max:");
        double max = Double.parseDouble(scan.nextLine());
        System.out.printf("%-20s %-10s \n", "Họ tên: ", "Điểm Tb: ");
        for (sinhVienPoly s : list) {
            if (s.diemTB >= min && s.diemTB <=max) {
                System.out.printf("%-20s %-10s \n", s.hoTen, s.diemTB);
            }
        }

    }

    public void Y04() {
        System.out.print("Nhập vào họ tên:");
        String hoTen = scan.nextLine();
        for (sinhVienPoly s : list) {
            if (s.hoTen.equalsIgnoreCase(hoTen));
            System.out.printf("%-20s %-10s \n", s.hoTen, s.diemTB);
            break;
        }

    }

    public void Y05() {
        System.out.print("Nhập vào họ tên:");
        String hoTen = scan.nextLine();
        for (sinhVienPoly s : list) {
            if (s.hoTen.equalsIgnoreCase(hoTen));
            System.out.println("------Cập nhật Thông tin------");
            System.out.println("Nhập tên:");
            s.hoTen = scan.nextLine();
            System.out.print("Nhập điểm: ");
            s.diemTB = Double.parseDouble(scan.nextLine());
            break;

        }
        System.out.println("------Thông tin sau khi cập nhật------");
        Y02();

    }

    public void Y06() {
        System.out.print("Nhập vào họ tên:");
        String hoTen = scan.nextLine();
        System.out.printf("%-20s %-10s \n", "Họ tên: ", "Điểm Tb: ");
        for (sinhVienPoly s : list) {
            if (s.hoTen.equalsIgnoreCase(hoTen)) {
                 list.remove(s);
            }
        }
        Y02();
        }
    
    
// sắp xếp theo điểm 
    public void Y07() {
        Comparator<sinhVienPoly> comp=new Comparator<sinhVienPoly>(){
            @Override
            public int compare(sinhVienPoly a,sinhVienPoly b){
                 Double x=new Double(a.diemTB);
                 Double y=new Double(b.diemTB);
                 return x.compareTo(y);
            }
        };
        Collections.sort(list,comp);
        Y02();
    }

    public void Y08() {
         Comparator<sinhVienPoly> comp=new Comparator<sinhVienPoly>(){
            @Override
            public int compare(sinhVienPoly t,sinhVienPoly t1){
              Double x=new Double(t.diemTB);
                 Double y=new Double(t1.diemTB);
                 return x.compareTo(y);
            }
        };
        Collections.sort(list,comp);
        Y02();
        
    }
}


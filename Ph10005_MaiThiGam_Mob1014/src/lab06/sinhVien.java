package lab06;

import java.util.Scanner;

public class sinhVien {

    public String hoTen;
    public String email;
    public String phone;
    public String cmnd;
    Scanner scan = new Scanner(System.in);

    // kiểm tra email
    String ktEmail() {
        String kt = "\\w+@\\w+(\\.\\w+){1,2}";
        String e = scan.nextLine();

        while (e.matches(kt) == false) {
            System.out.println("Bạn đã nhập sai.");
            System.out.println("Nhập lại email:");
            e = scan.nextLine();
        }

        return e;
    }

    // kta sdt
    String ktSDT() {
        String kt = "0\\d{9,10}";
        String p = scan.nextLine();
        while (p.matches(kt) == false) {
            System.out.println("Bạn đã nhập sai.");
            System.out.println("Nhập lại phone:");
            p = scan.nextLine();
        }

        return p;
    }

    //ktra cmnd
    String ktCMND() {

        String kt = "\\d{10}";
        String c = scan.nextLine();
        while (c.matches(kt) == false) {
            System.out.println("Bạn đã nhập sai.");
            System.out.println("Nhập lại cmnd:");
            c = scan.nextLine();
        }

        return c;
    }

    public void output() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

package test_as;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//. Nhập danh sách nhân viên từ bàn phím.
//Y2. Xuất danh sách nhân viên ra màn hình. 
//Y3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím. 
//Y4. Xóa nhân viên theo mã nhập từ bàn phím. 
//Y5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím 
//Y6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.
//Y7. Sắp xếp nhân viên theo họ và tên. 
//Y8. Sắp xếp nhân viên theo thu nhập. 
//Y9. Xuất 5 nhân viên có thu nhập cao nhất. 
public class nhan_vien {

    public String ma_nhan_vien;
    public String ho_ten;
    public double luong;
    Scanner scan = new Scanner(System.in);

    public nhan_vien() {

    }

    public nhan_vien(String ma_nhan_vien, String ho_ten, double luong) {
        this.ma_nhan_vien = ma_nhan_vien;
        this.ho_ten = ho_ten;
        this.luong = luong;
    }

    public Double getThuNhap() {
        return luong;
    }

    public double getThueThuNhap(double thue) {
        if (luong < 9000000) {
            thue = 0;
        } else if (luong > 9000000 && luong < 15000000) {
            thue = 0.1 * luong;

        } else {
            thue = 0.12 * luong;
        }
        return thue;
    }

   

    public void nhap() {
        System.out.print("Nhập mã nhân viên:");
        ma_nhan_vien = scan.nextLine();
        System.out.print("Nhập Họ tên: ");
        ho_ten = scan.nextLine();
        System.out.print("Nhập lương: ");
        luong = scan.nextDouble();

    }

    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s .\n", "Mã nhân viên", "Họ tên", " Tổng Lương", "Thue thu Nhap", "");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s  .\n", ma_nhan_vien, ho_ten, luong, getThuNhap(),getThueThuNhap(luong));
    }

    

}

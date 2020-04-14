package bai2;

import java.util.Scanner;


public class tai_lieu {
    public String ma_Tai_Lieu;
    public String ten_Nha_Xuat_Ban;
    public int so_Ban_Phat_Hanh;
    Scanner scan = new Scanner(System.in);

    public tai_lieu () {
        
    }

    public tai_lieu(String ma_Tai_Lieu, String ten_Nha_Xuat_Ban, int so_Ban_Phat_Hanh ) {
        this.ma_Tai_Lieu = ma_Tai_Lieu;
        this.ten_Nha_Xuat_Ban = ten_Nha_Xuat_Ban;
        this.so_Ban_Phat_Hanh = so_Ban_Phat_Hanh;
    }

    public void nhap() {
        System.out.print("Nhập mã tài liệu:");
        ma_Tai_Lieu = scan.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        ten_Nha_Xuat_Ban = scan.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        so_Ban_Phat_Hanh = Integer.parseInt(scan.nextLine());
    }

    public void xuat() {
//        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã Tài Liệu ", "Tên Nhà Sản Xuất", "Số bản phát hành","Tên tác giả","Số trang","Số phát hành","Tháng phát hành","Ngày phát hành");
//        System.out.printf("%-20s %-20s %-20d %-20s %-20s %-20s %-20s %-20s \n", ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh,"","","","","");
    }
}
//Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//
//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//
//Các báo cần quản lý thêm: Ngày phát hành.
//
//Yêu cầu 1: Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
//
//Yêu cầu 2: Xây dựng lớp QuanLySach có các chức năng sau

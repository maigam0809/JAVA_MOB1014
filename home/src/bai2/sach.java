package bai2;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//Một thư viện cần quản lý các tài liệu bao gồm Sách, Tạp chí, Báo. 
//Mỗi tài liệu gồm có các thuộc tính sau: Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.
//
//Các loại sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
//
//Các tạp chí cần quản lý thêm: Số phát hành, tháng phát hành.
//
//Các báo cần quản lý thêm: Ngày phát hành.
//
//Yêu cầu 1: Xây dựng các lớp để quản lý tài liệu cho thư viện một cách hiệu quả.
//
//Yêu cầu 2: Xây dựng lớp QuanLySach có các chức năng sau
//
//Thêm mới tài liêu: Sách, tạp chí, báo.
//Xoá tài liệu theo mã tài liệu.
//Hiện thị thông tin về tài liệu.
//Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//Thoát khỏi chương trình.
public class sach extends tai_lieu {

    public String ten_Tac_Gia;
    public int so_trang;

    public sach() {

    }

    public sach(String ten_Tac_Gia, int so_trang, String ma_Tai_Lieu, String ten_Nha_Xuat_Ban, int so_Ban_Phat_Hanh ) {
        super(ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh);
        this.ten_Tac_Gia = ten_Tac_Gia;
        this.so_trang = so_trang;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhập tên tác giả: ");
        ten_Tac_Gia=scan.nextLine();
        do{
        System.out.print("Nhập số trang: ");
        so_trang=Integer.parseInt(scan.nextLine()); 
        }while(so_trang<0);
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã Tài Liệu ", "Tên Nhà Sản Xuất", "Số bản phát hành","Tên tác giả","Số trang","Số phát hành","Tháng phát hành","Ngày phát hành");
        System.out.printf("%-20s %-20s %-20d %-20s %-20d %-20s %-20s %-20s \n", ma_Tai_Lieu, ten_Nha_Xuat_Ban, so_Ban_Phat_Hanh,ten_Tac_Gia,so_trang,"","","");
        
        
    }

}

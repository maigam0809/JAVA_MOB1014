package bai1;

import java.util.Scanner;

/**
 *
 * @author luong
 */
//Bài 1
//Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
//
//Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
//Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
//Các nhân viên có thuộc tính riêng: công việc.
//Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.
//
//Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
//
//Thêm mới cán bộ.
//Tìm kiếm theo họ tên.
//Hiện thị thông tin về danh sách các cán bộ.
//Thoát khỏi chương trình.
public class can_bo {

    public Scanner scan = new Scanner(System.in);
    public String ho_ten;
    public int age;
    public String gioi_tinh;
    public String dia_chi;

    public can_bo() {

    }

    public can_bo(String ho_ten, int age, String gioi_tinh, String dia_chi) {
        this.ho_ten = ho_ten;
        this.age = age;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
    }

    public void nhap() {

        System.out.print("Nhập họ và tên :");
        ho_ten = scan.nextLine();
        System.out.print("Nhập tuổi :");
        age = Integer.parseInt(scan.nextLine());
        int b;
        do {
            System.out.println("Giới tính:");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.print("Mời chọn giới tính : ");
            b = Integer.parseInt(scan.nextLine());
            switch (b) {
                case 1:
                    gioi_tinh="Nam";
                    break;
                case 2:
                    gioi_tinh="Nữ";
                    break;
                default:
                    System.out.println("Ban đã chon sai");
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
        } while (b < 0 || b > 2);
        
        System.out.print("Nhập Địa chỉ :");
        dia_chi = scan.nextLine();
    }

    public void xuat() {
    }
}

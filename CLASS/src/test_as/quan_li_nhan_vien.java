package test_as;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class quan_li_nhan_vien {

    ArrayList<nhan_vien> list = new ArrayList<nhan_vien>();
    Scanner scan = new Scanner(System.in);

    int n;
// nhập danh sách

    public void NhapDanhSach() {
        System.out.print("Nhập số lượng nhân viên: ");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int chon;
            do {
                System.out.println("====Nhâp nhân viên thứ : " + (i + 1) + "=======");
                System.out.println("===========Có 3 loại nhân viên========");
                System.out.println("1.Hành Chính ");
                System.out.println("2.Tiếp thị.");
                System.out.println("3.Trưởng phòng ");
                System.out.println("======================================");
                System.out.print("Mời bạn chọn loại nhân viên: ");
                chon = scan.nextInt();
                switch (chon) {
                    case 1:
                        nhan_vien nv = new nhan_vien();
                        list.add(nv);
                        nv.nhap();
                        break;
                    case 2:
                        tiep_thi nt = new tiep_thi();
                        list.add(nt);
                        nt.nhap();
                        break;
                    case 3:
                        truong_phong np = new truong_phong();
                        list.add(np);
                        np.nhap();
                        break;

                }
            } while (chon < 0 || chon > 3);
        }
    }
// xuất danh sách

    public void XuatDanhSach() {
        System.out.printf("%-20s %-20s %-20s %-20s  %-20s .\n", "Mã nhân viên", "Họ tên", " Tổng Lương", "Thhu Nhap", "Thue thu nhap");
        for (nhan_vien s : list) {
            s.xuat();
        }
    }

    // tìm và hiển thị nhân viên theo mã nhập
    public void TimVaHienThi() {
        scan.nextLine();
        System.out.print("Nhập mã nhập bạn muốn tìm: ");
        String ma = scan.nextLine();

        System.out.printf("%-20s %-20s %-20s %-20s  %-20s.\n", "Mã nhân viên", "Họ tên", " Tổng Lương", "Thu Nhap", "Thue Thu nhap");
        for (nhan_vien s : list) {
            if (s.ma_nhan_vien.equalsIgnoreCase(ma)) {
                s.xuat();
            }
        }

    }

    //Xóa nhân viên theo mã nhập từ bàn phím. 
    public void Xoa() {
        scan.nextLine();

        System.out.print("Nhập mã nhân viên muốn xóa: ");
        String ma = scan.nextLine();

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(i)) {
                list.remove(ma);
            }

        }
        System.out.print("==========danh sach sau khi xoa ========");
        XuatDanhSach();
    }

    // Cập nhật thông tin nhân viên theo mã nhập từ bàn phím 
    public void CapNhat() {
        System.out.print("Nhập mã nhân viên ");
        String ma = scan.nextLine();

        for (nhan_vien s : list) {
            if (s.ma_nhan_vien.equalsIgnoreCase(ma)) {
                s.nhap();
            }
        }

        System.out.println("====== Danh sách sau khi sửa====");
        XuatDanhSach();
    }
    // Tìm các nhân viên theo khoảng lương nhập từ bàn phím.

    public void KhoangLuong() {
        System.out.print("Nhập vào khoảng lương min: ");
        double min = scan.nextDouble();
        System.out.print("Nhập vào khoảng lương max: ");
        double max = scan.nextDouble();

        System.out.printf("%-20s %-20s %-20s %-20s  .\n", "Mã nhân viên", "Họ tên", " Tổng Lương", "Thue thu Nhap");
        for (nhan_vien s : list) {
            if (s.luong > min && s.luong < max) {
                s.xuat();
            }
        }
    }

    //Y7. Sắp xếp nhân viên theo họ và tên. 
    public void SapXepTheoHoten() {
        Comparator<nhan_vien> comp = new Comparator<nhan_vien>() {
            @Override
            public int compare(nhan_vien t, nhan_vien t1) {
                return t.ho_ten.compareTo(t1.ho_ten);
            }

        };
        Collections.sort(list, comp);
    }

    //Y8. Sắp xếp nhân viên theo thu nhập. 
    public void SapXepTheoThuNhap() {
        Comparator<nhan_vien> comp = new Comparator<nhan_vien>() {
            @Override
            public int compare(nhan_vien t, nhan_vien t1) {
                return t.getThuNhap().compareTo(t1.getThuNhap());
            }

        };
        Collections.sort(list, comp);
    }
}

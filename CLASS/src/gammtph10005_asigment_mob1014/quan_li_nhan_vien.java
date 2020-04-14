package gammtph10005_asigment_mob1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class quan_li_nhan_vien {

    ArrayList<nhanVien> list = new ArrayList<nhanVien>();
    Scanner scan = new Scanner(System.in);

    // nhập và thêm danh sách
    public void Y01() {

        System.out.println("Nhập số lượng nhân viên : ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ : " + (i + 1));
            System.out.println("Mời bạn chọn loại nhân viên:");
            System.out.println("1.Nhâm viên hành chính.");
            System.out.println("2,Nhân viên tiếp thị");
            System.out.println("3.Trưởng phòng");
            System.out.println("-----------------");
            int chon = scan.nextInt();
            switch (chon) {
                case 1:
                    nhanVien nv = new nhanVien();
                    nv.nhap();
                    list.add(nv);
                    break;
                case 2:
                    tiepThi tt = new tiepThi();
                    tt.nhap();
                    list.add(tt);
                    break;
                case 3:
                    truongPhong tp = new truongPhong();
                    tp.nhap();
                    list.add(tp);
                    break;
            }
        }
    }
    // xuat danh dach nhan vien

    public void Y02() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ", "Thu Nhập:", "Thuế TN:");
        for (nhanVien s : list) {
            s.xuat();
        }
    }

    //tìm và hien thi sinh viên theo mã số nhân viên
    public void Y03() {
        scan.nextLine();
        System.out.println("Nhập mã số nhân viên muốn tìm: ");
        String code = scan.nextLine();

        System.out.println("====Thông tin nhâm viên đó là :====");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ", "Thu Nhập:", "Thuế TN:");
        int vitri = -1;
        for (nhanVien s : list) {
            if (s.getMaNV().equalsIgnoreCase(code)) {
                vitri = list.indexOf(s);

            }
        }
        if (vitri == -1) {
            System.out.println("Không tìm thấy nhân viên nào");
        } else {
            list.get(vitri).xuat();
        }

    }

    // xóa  nhân viên theo mã nhập từ bàn phím
    public void Y04() {
        scan.nextLine();
        System.out.println("Nhập mã nhân viên muốn xóa: ");
        String code = scan.nextLine();

        System.out.println("Danh sách thông tin nhân viên sau khi xóa là : ");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ", "Thu Nhập:", "Thuế TN:");

        int size = list.size();

        for (int i = 0; i < size; i++) {
            if (list.get(i).getMaNV().equalsIgnoreCase(code)) {
                list.remove(list.get(i));
                break;
            }

        }
        System.out.println("Danh sách sau khi xóa là: ");
        Y02();

    }

// cập nhật thông tin nhân viên theo mã nhập từ bàn phím( sửa)
    public void Y05() {
        System.out.println("Nhập mã nhân viên muốn sửa: ");
        String code = scan.nextLine();

        for (nhanVien s : list) {
            if (s.getMaNV().equalsIgnoreCase(code)) {
                System.out.println("Mời nhập lại thông tin nhân viên đó:");
                s.nhap();
            }
        }
        System.out.println("Danh sách nhân viên sau khi sửa là: ");
        Y02();
    }

// tìm các nhân viên theo khoảng lương nhập từ bàn phím
    public void Y06() {
        System.out.println("Mời nhập khoảng lương min : ");
        double min = scan.nextDouble();
        System.out.println("Mời khoảng lương max: ");
        double max = scan.nextDouble();

        System.out.println("Nhân viên trong khoảng từ min tới max là : ");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ", "Thu Nhập:", "Thuế TN:");

        for (nhanVien s : list) {
            if (s.getLuong() >= min && s.getLuong() <= max) {
                s.xuat();
            }
        }
    }
//sắp xếp nhân viên theo họ tên

    public void Y07() {
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
               return t.getHoTen().compareTo(t1.getHoTen());
            }
        };
        Collections.sort(list,comp);
        Y02();
    }

// sắp xếp nhân viên theo thu nhập
    public void Y08() {
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
                return t.getThuNhap().compareTo(t1.getThuNhap());
            }

        };
        Collections.sort(list, comp);
        Y02();

    }
// xuất 5 nhân viên có thu nhập cao nhất

    public void Y09() {

        Y08();
        Collections.reverse(list);

        System.out.println("==============Xuất 5 nhân viên có thu nhập cao nhất===========");
//        int size = list.size();
        if (list.size() < 5) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).xuat();

            }

        } else {
            for (int i = 0; i < 5; i++) {
                list.get(i).xuat();

            }

        }
    }
}

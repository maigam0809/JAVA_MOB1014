package gammtph10005_asigment_mob1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quan_li_nhan_vien {

    ArrayList<nhanVien> list = new ArrayList<nhanVien>();
    Scanner scan = new Scanner(System.in);
   
    
    // nhập và thêm danh sách
    public void Y01() {
        
        System.out.println("==========Mời bạn nhập số lượng nhân viên========");
        int n=scan.nextInt();
        //int n = Integer.parseInt(scan.nextLine());
       
        
        for (int i = 0; i < n; i++) {
            System.out.println("======Nhập thông tin nhân viên thứ : " + (i + 1) + "=======");
            System.out.println("============= Các loại nhân viên ============");
            System.out.println("1.Nhân viên hành chính(Nhân viên)");
            System.out.println("2.Nhân viên tiếp thị.");
            System.out.println("3.Nhân viên trưởng phòng.");
            System.out.println("===============================================");
            System.out.print("Mời bạn chọn loại nhân viên : ");
            int a;
            do {
                a = scan.nextInt();

                switch (a) {
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
                    default:
                        System.out.print("Mời bạn nhập lại: ");
                }
            } while (a < 1 || a > 3);
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
        System.out.print("Nhập mã số nhân viên muốn tìm :");
        scan.nextLine();
        String ma = scan.nextLine();
        
        System.out.println("===========Thông tin nhân viên muốn tìm =======");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n","Mã NV:", "Tên: ", "Lương: ", "Thu Nhập:", "Thuế TN:");

        int vitriNV = -1;
        for (nhanVien s : list) {
            if (s.maNV.equalsIgnoreCase(ma)) {
                vitriNV = list.indexOf(s);// inddexxOf tìm  vị trí đầu tiên  tại phần tử
            }
        }

        if (vitriNV == -1) {
            System.out.println("Không tìm thấy nhân viên.");
        } else {
            list.get(vitriNV).xuat();
        }

    }

    // xóa  nhân viên theo mã nhập từ bàn phím
    public void Y04() {
        System.out.print("=========Nhập vào mã muốn xóa==========");
        String ma = scan.nextLine();

        int size = list.size();

       for(int i=0;i<size;i++){
           if(list.get(i).maNV.equalsIgnoreCase(ma)){
               list.remove(list.get(i));
               break;
           }
       }
        System.out.println("====DAnh sách sau khi xóa : ====");
        Y02();
    }

// cập nhật thông tin nhân viên theo mã nhập từ bàn phím( sửa)
    public void Y05() {
        System.out.println("=========Nhập mã thông tin cần sửa =========");
        String ma = scan.nextLine();
        
        for (nhanVien s : list) {
            if (s.maNV.equalsIgnoreCase(ma)) {
                System.out.println("======Nhập lại thông tin của nhân viên =========");
                s.nhap();
            }
        }
        System.out.println("=======Danh sách sau khi sửa =====");
        Y02();
    }

// tìm các nhân viên theo khoảng lương nhập từ bàn phím
    public void Y06() {
        System.out.print("Nhập vào khoảng lương min:");
        double min = Double.parseDouble(scan.nextLine());
        System.out.print("Nhập vào khoảng lương max:");
        double max = Double.parseDouble(scan.nextLine());
        
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s \n", "Mã NV:", "Tên: ", "Lương: ", "Thu Nhập:", "Thuế TN:");
        for (nhanVien scan : list) {
            if (scan.luong >= min && scan.luong <= max) {
                scan.xuat();
            }
        }
    }
//sắp xếp nhân viên theo họ tên

    public void Y07() {
        Comparator<nhanVien> comp = new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien t, nhanVien t1) {
                return t.hoTen.compareTo(t1.hoTen);
            }
        };
        Collections.sort(list, comp);
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

        System.out.println("==============Xuất 5 sinh viên có thu nhập cao nhất===========");
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

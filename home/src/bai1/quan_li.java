package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luong
 */
public class quan_li {

    ArrayList<can_bo> list = new ArrayList<can_bo>();
    Scanner scan = new Scanner(System.in);
    int n;

    public void NhapThongTin() {

        System.out.println("=========== Mời bạn nhập số lượng=============");
        n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("==========Nhập thông tin nhân viên thứ :" + (i + 1) + "==========");
            System.out.println("Mời bạn chọn loại cán bộ :");
            System.out.println("1.Nhân viên");
            System.out.println("2.Công nhân");
            System.out.println("3.Kỹ sư");
            
            System.out.println("================================================");
            int a = Integer.parseInt(scan.nextLine());

            switch (a) {
                case 1:
                    nhan_vien nv = new nhan_vien();
                    nv.nhap();
                    list.add(nv);
                    break;
                case 2:
                    cong_nhan cn = new cong_nhan();
                    cn.nhap();
                    list.add(cn);
                    break;
                case 3:
                    ky_su ks = new ky_su();
                    ks.nhap();
                    list.add(ks);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại:");
                    break;
            }
        }
    }

    public void XuatThongTin() {
       can_bo sc =new can_bo();
       System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Họ tên:", "Tuổi:", "Giới tính: ", "Địa Chỉ:","Công việc: ","Ngành đào tạo: ","Cấp bậc: ");

        for (can_bo s : list) {
            s.xuat();
        }
    }

    public void HienThiTheoTen() {

        System.out.println("===== Nhâp tên cần muốn tìm  :");
        String ten = scan.nextLine();

        System.out.println("=======Thông tin tên cần tìm là:========");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Họ tên:", "Tuổi:", "Giới tính: ", "Địa Chỉ:","Công việc: ","Ngành đào tạo: ","Cấp bậc: ");
        int vitriNV = -1;
        for (can_bo s : list) {
            if (s.ho_ten.equalsIgnoreCase(ten)) {
                vitriNV = list.indexOf(s);
            }
            if (vitriNV == -1) {
                System.out.println("Không tìm thấy nguoi do.");
            } else {
//                list.get(vitriNV).xuat();
                  s.xuat();
            }
        }
    }

    public void hienThi() {
        System.out.println("===== Nhâp tên cần muốn tìm  :");
        String ten = scan.nextLine();

        System.out.println("=======Thông tin tên cần tìm là:========");
          System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Họ tên:", "Tuổi:", "Giới tính: ", "Địa Chỉ:","Công việc: ","Ngành đào tạo: ","Cấp bậc: ");
        for (can_bo s : list) {
            if (s.ho_ten.equalsIgnoreCase(ten)) {
                s.xuat();
            }
        }

    }
}

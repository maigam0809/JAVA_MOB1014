package nha_dat;

/**
 *
 * @author luong
 */
//Xây dựng một chương trình quản lí danh sách nhà đất :
//Thông tin gồm
//1.giao dịch đất:Mã giao dịch,ngày giao dịch(tháng,ngày ,năm),đơn giá,loại đất(A,B,C),diên tích
//-Loại b,c: tính tiền=diện tích* đơn giá;
//-loại a: tính tiền=diện tích*đơn giá*1,5;
//2.Giao dịch nhà : mã giao dịch,ngày tháng ,năm,đơn giá,loại nhà (cao câp, thường),diên tích
//-Loại cao cấp : tính tiền =diện tích*đơn giá;
//-Lọa thường: tính tiền =diện tích*đơn giá*0,9;
//Thực hiện các yêu cầu sau 
//1.Xây dựng các lớp kế thừa
//2. Nhập ,xuất danh sách giao dịch
//3.Tính tổng số lượng cho từng loại
//4.tính trung bình tiền của các giao dịch đất
//5.Xuất các giao dịch của tháng 9/2013
public class giao_dich_nha extends giao_dich {

    public String loai_dat;
    public double tinh_tien;

    public giao_dich_nha() {
    }

    public giao_dich_nha(String loai_dat, double tinh_tien, String ma_giao_dich, int nam, int thang, int ngay, double don_gia, double dien_tich) {
        super(ma_giao_dich, nam, thang, ngay, don_gia, dien_tich);
        this.loai_dat = loai_dat;
        this.tinh_tien = tinh_tien;
    }

    public void nhap() {
        super.nhap();
        
        //cách 1
        do {
            loai_dat=scan.nextLine();
            System.out.println("==========Loại đất ========");
            System.out.println("A.Loại A");
            System.out.println("B.Loại B");
            System.out.println("C.Loại C");
            System.out.println("===========================");
            System.out.print("Mời bạn chọn loại : ");
            if (loai_dat == "C" || loai_dat == "B") {
                tinh_tien = don_gia * 1.5;
            } else if (loai_dat == "A") {
                tinh_tien = don_gia * 0.9;
            }
        } while (loai_dat != "A" || loai_dat != "B" || loai_dat != "C");
        
        
        // cách 2:
        int loai;
        do {
            System.out.println("==========Loại đất ========");
            System.out.println("1.Loại A");
            System.out.println("2.Loại B");
            System.out.println("3.Loại C");
            System.out.println("===========================");
            System.out.print("Mời bạn chọn loại : ");
            loai = Integer.parseInt(scan.nextLine());

            switch (loai) {
                case 1:
                    loai_dat = "A";
                    tinh_tien = don_gia * 0.9;
                    break;
                case 2:
                case 3:
                    loai_dat = "B";
                    tinh_tien = don_gia * 1.5;
                    break;

            }
        } while (loai <= 0 || loai > 3);

    }

    public void xuat() {
        super.xuat();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "Mã Giao dịch", "Ngày ", "Tháng", "Năm", "Đơn giá", "Diện tích", "Loại đất", "Tính tiền");
        System.out.printf("%-20s %-20d %-20d %-20d %-20.1f %-20.1f .\n ", ma_giao_dich, ngay, thang, nam, don_gia, dien_tich, loai_dat, tinh_tien);
    }
}

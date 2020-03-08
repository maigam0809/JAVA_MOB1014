package lab07.bai1;


public class hVuong extends hinhChuNhat {

    public hVuong(double canh) {
        super(canh, canh);
        dai = rong = canh;
    }
    

    public void xuat() {
        double chuVi = dai * 4;
        double dienTich = dai * dai;
        System.out.printf("%-20s %-20s %-20s  \n", "Chiều dài ", "chu vi", "Diện tích :");
        System.out.printf("%-20f %-20f %-20f  \n", dai, chuVi, dienTich);

    }
}

package lab07.bai2_4;

public abstract class sinhVienIT  extends sinhVienPoLy{
    double diemJaVa;
    double diemCss;
    double diemHtml;

    public sinhVienIT(String hoTen,double diemJaVa, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJaVa = diemJaVa;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    @Override
    public double getDiem(){
        return (diemJaVa*2+diemHtml+diemCss)/4;
    }
}

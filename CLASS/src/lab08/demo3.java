package lab08;

/**
 *
 * @author luong
 */
public class demo3 {

    int rollo;
    String name;
    static String college = "BachKhoa";

    static void change() {
        college = "Cao Đẳng Thực Hnahf FPT-Polytechnic";
    }

    public demo3(int rollo, String name) {
        this.rollo = rollo;
        this.name = name;
    }

    void display() {
        System.out.println(rollo + "" + name + "" + college);
    }

    public static void main(String[] args) {
        demo3 sv1 = new demo3(1, "Thông");
        demo3 sv2 = new demo3(2, "Quynhf");
        demo3 sv3 = new demo3(3, "Mai");
        demo3 sv4 = new demo3(4, "gam");
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();
    }
}

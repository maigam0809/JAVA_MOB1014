
/**
 *
 * @author luong
 */
public class demo2 {
    int rollo;
    String name;
    static String college="BachKhoa";

    public demo2(int rollo, String name) {
        this.rollo = rollo;
        this.name = name;
    }
    void display(){
        System.out.println(rollo+""+name+""+college);
}
    public static void main(String[] args){
        demo2 sv1=new demo2(1, college);
        demo2 sv2=new demo2(2,college);
        sv1.display();
        sv2.display();
    }
}

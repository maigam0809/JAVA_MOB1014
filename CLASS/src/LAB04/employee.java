package LAB04;

import java.util.Scanner;

/**
 *
 * @author luong
 */
public class employee {
    public String fullname;
    public double salary;
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.fullname = scan.nextLine();
        
        System.out.print("Nhập lương: ");
        this.salary = scan.nextDouble();
    }
    
    public void output(){
        System.out.println("Ten: " + this.fullname);
        System.out.println("Luong: " + this.salary);
    }
}

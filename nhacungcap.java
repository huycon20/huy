import java.util.Scanner;
public class nhacungcap {
    public static void main(String[] args) {
       
        nhacungcap ncc1 = new nhacungcap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhà cung cấp : ");
        ncc1.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên nhà cung cấp: ");
        ncc1.setTenSV(sc.nextLine());
        System.out.println("Nhập địa chỉ nhà cc: ");
        ncc1.setDiemTL(sc.nextLine());
        
        nhacungcap ncc2 = new nhacungcap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhà cung cấp : ");
        ncc2.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên nhà cung cấp: ");
        ncc2.setTenSV(sc.nextLine());
        System.out.println("Nhập địa chỉ nhà cc: ");
        ncc2.setDiemTL(sc.nextLine());
        
       
       
 
        
        System.out.printf("%6s %10s %20s %10s %10s \n","Mã nhà cung cấp","Họ tên","Địa chỉ");
        
        ncc1.inNCC();
        ncc2.inNCC();
        
    }
}
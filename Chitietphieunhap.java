
import java.util.Scanner;

public class Chitietphieunhap extends PhieuNhap{
    int MaPhieuNhap;
    String TenPhieuNhap;
    int SoLuong;
    String HanSuDung;
    
    void nhap() {
    	Scanner scanner = new Scanner(System.in);
         System.out.print("Nhập mã phiếu: ");
    MaPhieuNhap = scanner.nextInt();
    System.out.print("Nhập tên phiếu nhập: ");
    TenPhieuNhap = scanner.nextLine();
    System.out.print("Nhập số lượng: ");
    SoLuong = scanner.nextInt();
    System.out.print("Nhập hạn sử dụng: ");
    HanSuDung = scanner.nextLine();
    }
    void in(){
         System.out.println("Mã phiếu:"+MaPhieuNhap +"\n" +"Tên Phiếu Nhâp:"+ TenPhieuNhap +"\n"+"Số lượng:"+ SoLuong +"hạn sử dụng: "+HanSuDung);
    }
    
}
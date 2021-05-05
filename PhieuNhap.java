

import java.util.Scanner;

public class PhieuNhap{
    int MaPhieuNhap;
    String NgayNhap;
    String TenNhanVien;
    
    void Nhap(){
    	Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập mã phiếu: ");
    MaPhieuNhap = scanner.nextInt();
    NgayNhap = scanner.nextLine();
    System.out.print("Nhập tên nhân viên: ");
    TenNhanVien = scanner.nextLine();
    }
    void HienThi(){
        System.out.println("Mã:"+MaPhieuNhap +"\n" +"Ngày Nhâp:"+NgayNhap +"\n"+"Tên giáo viên:"+ TenNhanVien);
    }
    
}

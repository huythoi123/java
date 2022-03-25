package main;
import java.util.*;

import quanlynhanvien.NhanVienFullTime;
import quanlynhanvien.NhanVienPartTime;
import util.Configs;
import quanlynhanvien.NhanVien;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so luong nhan vien");
		int soluong = Integer.parseInt(sc.nextLine());
		
		NhanVien[] mangNhanVien = new NhanVien[soluong];
		for (int i=0;i<soluong;i++) {
			System.out.println("nhap ten nhan vien: ");
			String ten = sc.nextLine();
			System.out.println("1- fulltime; 2- parttime.");
			int loainhanvien= Integer.parseInt(sc.nextLine());
			if(loainhanvien==1) {
				System.out.println("1-Boss; 2- Linh. ");
				int chucVu= Integer.parseInt(sc.nextLine());
				System.out.println("so ngay lam them: ");
				int ngaylamthem = Integer.parseInt(sc.nextLine());
				mangNhanVien[i] = new NhanVienFullTime(ten, ngaylamthem, chucVu);
			}
			else {
				System.out.println("so gio lam them: ");
				int giolam = Integer.parseInt(sc.nextLine());
				mangNhanVien[i]= new NhanVienPartTime(ten, giolam);
			}
		}
		System.out.print("ket qua tinh luong: ");
		for (NhanVien nhanvien : mangNhanVien) {
			nhanvien.tinhLuong();
			nhanvien.xuatThongTin();
		}
	}

}

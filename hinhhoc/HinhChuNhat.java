package hinhhoc;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
	float dai;
	float rong;
	public HinhChuNhat() {
		ten="Hinh Chu Nhat";
	}
	public HinhChuNhat(float dai, float rong) {
		this();
		this.dai=dai;
		this.rong=rong;
	}
	public void nhapChieuDai() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap chieu dai: ");
		dai= sc.nextFloat();
	}
	public void nhapChieuRong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap chieu rong: ");
		rong= sc.nextFloat();
	}
	public void tinhChuVi() {
		chuVi=(dai+rong)*2;
	}
	public void tinhDienTich() {
		dienTich= dai*rong;
	}
}

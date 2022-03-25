package hinhhoc;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
	public float PI = 3.14f;
	float banKinh;
	public HinhTron() {
		ten="hinh tron";
	}
	public HinhTron(float banKinh) {
		this.banKinh=banKinh;
	}
	public float tinhChuVi() {
		chuVi=2*PI*banKinh;
		return chuVi;
	}
	public float tinhDienTich() {
		dienTich=PI*banKinh*banKinh;
		return dienTich;
	}
	public void xuatThongTin() {
		System.out.println("day la hinh tron");
		System.out.println("Hinh tron co chu vi: "+ tinhChuVi() +"co dien tich la: "+ tinhDienTich());
	}
}

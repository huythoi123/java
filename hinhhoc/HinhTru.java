package hinhhoc;
import java.util.*;
public class HinhTru extends HinhTron {
	float chieuCao;
	public HinhTru() {
		ten="Hinh tru";
	}
	public HinhTru(float banKinh ,float chieuCao) {
		super(banKinh);
		this.chieuCao=chieuCao;
	}
	
	public float tinhTheTich() {
		return tinhDienTich()*chieuCao;
		
	} 
	@Override
	public void xuatThongTin() {
		System.out.println("day la hinh Tru");
		System.out.println("hinh tru co dien tich mot mat day la:"+ tinhDienTich());
		System.out.print("hinh tru co the tich la: "+ tinhTheTich());
	}
}

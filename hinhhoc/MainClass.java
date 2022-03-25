package hinhhoc;

public class MainClass {

	public static void main(String[] args) {
		/*HinhTron hinhtron = new HinhTron(6);
		hinhtron.tinhChuVi();
		hinhtron.tinhDienTich();
		hinhtron.xuatThongTin();*/

		HinhTru hinhtru= new HinhTru(4,8);
		hinhtru.tinhTheTich();
		hinhtru.xuatThongTin();
		System.out.println(" ");
		System.out.println(hinhtru.getClass());
		
		/*HinhChuNhat hcn = new HinhChuNhat(4,7);
		hcn.xuatTen();
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.inChuVi();
		hcn.inDienTich();
		
		HinhVuong hv = new HinhVuong();
		hv.xuatTen();
		hv.nhapCanh();
		hv.tinhChuVi();
		hv.tinhDienTich();
		hv.inChuVi();
		hv.inDienTich();*/
	}

}

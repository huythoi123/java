package quanlynhanvien;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
	private int gioLamViec;
	public NhanVienPartTime(String ten, int gioLamViec) {
		this.ten=ten;
		this.gioLamViec=gioLamViec;
	}
	@Override
	public String loaiNhanVien() {
		return "nhan vien thoi vu";
	}
	public void tinhLuong() {
		luong = Configs.LUONG_NHAN_VIEN_PARTTIME_MOI_GIO*gioLamViec;
	}
}

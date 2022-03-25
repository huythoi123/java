package quanlynhanvien;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
	private int ngayLamThem;
	private int loaiChucVu;
	
	public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
		super(ten);
		this.ngayLamThem=ngayLamThem;
		this.loaiChucVu = loaiChucVu;
	}

	@Override
	public String loaiNhanVien() {
		if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
			return "linh toan thoi gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
			
		}
		else {
			return "sep toan thoi gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
		}
	}
	public void tinhLuong() {
		if (loaiChucVu==Configs.NHAN_VIEN_LINH) {
			luong = Configs.LUONG_NHAN_VIEN_FULLTIME_LINH +ngayLamThem*Configs.LUONG_LAM_THEM_MOT_NGAY;	
		}
		else {
			luong = Configs.LUONG_NHAN_VIEN_FULLTIME_SEP + ngayLamThem*Configs.LUONG_LAM_THEM_MOT_NGAY;
		}
	}
}

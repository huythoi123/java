package hinhhoc;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
	public HinhVuong() {
		ten="hinh vuong";
	}
	public void nhapCanh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi nhap canh: ");
		dai=rong=sc.nextFloat();
	}
}

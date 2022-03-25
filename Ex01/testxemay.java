package Example.Ex01;
import java.util.ArrayList;
import java.util.Scanner;
public class testxemay {
	
	static Scanner sc = new Scanner(System.in);
	public static void inputXemay(ArrayList<xemay> XeMay, int n)
	{
		for (int i=0; i<n;i++) {
			String id = sc.nextLine();
			String name = sc.nextLine();
			String manu = sc.nextLine();
			int quantity = Integer.parseInt(sc.nextLine());
			double price = Double.parseDouble(sc.nextLine());
			double weight = Double.parseDouble(sc.nextLine());
			String date = sc.nextLine();
			xemay moto = new xemay(id, name, manu, quantity, price, weight, date);
			XeMay.add(moto);
		}
	}
	public static ArrayList<xemay> getMaxweight(ArrayList<xemay> moto) {
		ArrayList<xemay> hihi = new ArrayList<xemay>();
		double max = moto.get(0).getWeight();
		for (int i=0;i<moto.size();i++) {
			if(max <= moto.get(i).getWeight()) {
				max = moto.get(i).getWeight();
			}
		} 
		for (int i=0; i<moto.size();i++) {
			if (max == moto.get(i).getWeight()) {
				hihi.add(moto.get(i));
			}
		}
		return hihi;
	}
	public static void main(String[] args) {
		int n =sc.nextInt();
		ArrayList<xemay> mt = new ArrayList<xemay>();
		inputXemay(mt,n);
		for (int i=0;i<mt.size();i++) {
			System.out.println(mt.get(i).toString());
		}
		//System.out.println(getMaxweight(mt));
		System.out.println(mt);
	}
}

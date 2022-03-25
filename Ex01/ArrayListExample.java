package Example.Ex01;
import java.util.ArrayList;
class ArrayListExample {
	public static void main(String[] arguments){
		ArrayList<String> huy = new ArrayList<String>();
		huy.add("An");
		huy.add("Binh");
		huy.add("Chi");
		huy.add("huy thoi 123");
		System.out.println("So phan tu trong danh sach: " + huy.size());
		System.out.println("Phan tu 3: " + huy.get(3));
		System.out.println("Phan tu 1: " + huy.get(1));
		System.out.println("Phan tu 2: " + huy.get(2));
		System.out.println("Phan tu 0: " + huy.get(0));
		huy.set(0, "Tam biet");
		String deleted = huy.remove(1);
		System.out.println("Phan tu da xoa: " + deleted);
		System.out.println("In cac phan tu su dung vong lap thong thuong:");
		for(int i=0; i<huy.size(); i++){
			System.out.println("Phan tu " + i + ": " + huy.get(i));
		}
		System.out.println("In cac phan tu su dung vong lap danh sach:");
		int i = 0;
		for (String s : huy){ 
			System.out.println("Phan tu " + i + ": " + s); 
			i ++;
		} 
	} 
}

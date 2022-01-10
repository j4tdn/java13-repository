package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		List<DiskCD> cds = getCD();

		System.out.println(addCD(cds, new DiskCD(5, " Rap ", " Den", 5, 200)));

		System.out.println("số lượng CD: " + cds.size());

		System.out.println("Tổng giá thành : " + sumPrice(cds));

		cds.sort(Comparator.comparing(DiskCD::getPrice).reversed());
		print(cds);
		
		System.out.println("======================");
		cds.sort(Comparator.comparing(DiskCD::getIdCD));
		print(cds);

	}

	private static List<DiskCD> getCD() {
		List<DiskCD> cds = new ArrayList<>();
		cds.add(new DiskCD(1, " Rap ", " Den", 5, 200));
		cds.add(new DiskCD(2, " chill ", " Vu ", 2, 350));
		cds.add(new DiskCD(3, " rock ", " buc tuong", 4, 450));
		cds.add(new DiskCD(4, " Viet ", " hien ho ", 5, 550));
		return cds;
	}

	private static boolean addCD(List<DiskCD> listCD, DiskCD cd) {
		if (listCD.contains(cd)) {
			return false;
		}
		listCD.add(cd);
		return true;
	}

	private static double sumPrice(List<DiskCD> listCDs) {
		double result = 0;
		for (DiskCD cd : listCDs) {
			result += cd.getPrice();
		}
		return result;
	}
	
	private static void print(List<DiskCD> cds) {
		for (DiskCD cd : cds ) {
			System.out.println(cd);
		}
	}
}

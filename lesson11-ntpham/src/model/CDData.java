package model;

import java.util.LinkedHashSet;
import java.util.Set;

import bean.CD;

public class CDData {
	private CDData() {
	}
	
	public static Set<CD> getAll() {	
		Set<CD> cds = new LinkedHashSet<CD>();
		cds.add(new CD(1, "VCD", "JohnMith", 5, 320));
		cds.add(new CD(2, "DVD", "Smith", 2, 120));
		cds.add(new CD(3, "CD", "David", 3, 170));
		cds.add(new CD(4, "VCD", "James", 4, 270));
		cds.add(new CD(5, "DVD", "Katlyn", 3, 200));
		return cds;
	}
	
	public static void print(Set<CD> cds) {
		for(CD cd : cds) {
			System.out.println(cd);
		}
	}
}

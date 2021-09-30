package Ex01;

public class StudentUtils {
	private StudentUtils() {
	}

	public static void averMarkThan85(Student[] svs) {
		for(Student sv:svs) {
			if(sv.averMark() > 8.5) {
				System.out.println(sv);
			}
		}
	}

	public static void theoMarkThanPracMark(Student[] svs) {
		for(Student sv:svs) {
			if(sv.getTheoMark() > sv.getPracMark()) {
				System.out.println(sv);
			}
		}
	}
}

package structure;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		float[] point = {5.1f, 7.2f, 6, 8.3f , 4.5f, 9 , 6.8f};
		
		float avgPoint = point[rd.nextInt(point.length)];
		System.out.println("point: "+ avgPoint);
		
		Levels pPoint = getLevel(avgPoint);
		System.out.println("Level: " + pPoint.value);
	}
	private static Levels getLevel(float point) {
		if (point < 5) {
			return Levels.BAD;
		}
		if (point >= 5 && point <= 6.5) {
			return Levels.MEDIUM;
		}
		if (point >= 6.6 &&  point <= 8) {
			return Levels.PRETTY_GOOD;
		}
			return Levels.GOOD;
		}	
	}


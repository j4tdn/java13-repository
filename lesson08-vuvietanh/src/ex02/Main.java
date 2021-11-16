package ex02;

public class Main {
	public static void main(String[] args) {
		String name = "  aDam Le vAN john Son   ";
		outputName(name);
	}

	public static void outputName(String name) {
		name = name.trim().toLowerCase();
		name = name.replaceAll("\\s+", " ");
		String[] Str = name.split(" ");
		name = "";
		for (int i = 0; i < Str.length; i++) {
			name += String.valueOf(Str[i].charAt(0)).toUpperCase() + Str[i].substring(1);
			if (i < Str.length - 1)
				name += " ";
		}
		System.out.println(name);
	}


}

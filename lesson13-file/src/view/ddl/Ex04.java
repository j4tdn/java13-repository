package view.ddl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Ex04 {
	private static final String path = "storage" + File.separator + "downloads";

	public static void main(String[] args) {
		File file = new File(path);
		if (file.exists()) {
//			File[] files = file.listFiles();
//			
//			
//			// Cannot use endsWith() ex: file name: atxt, folder name: txt
//			Stream.of(files).filter(x -> !x.getName().substring(x.getName().lastIndexOf(".") + 1).equals("txt"))
//					.forEach(x -> x.delete());
//		
			File[] files = file.listFiles(new FileFilter() {

				@Override
				public boolean accept(File file) {
					String name = file.getName();
					String extension = name.substring(name.lastIndexOf(".") + 1);
					return !"txt".equals(extension);
				}
			});

			Arrays.stream(files).forEach(f -> f.delete());
		}
		System.out.println("Successfully!");
	}
}

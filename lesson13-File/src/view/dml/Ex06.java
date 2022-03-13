package view.dml;

import java.io.File;
import java.util.List;

import bean.Apple;
import bean.Transaction;
import utils.FileUtils;

public class Ex06 {
	
	private static final String pathname = "storage" + File.separator + "data" + File.separator + "apple.txt";
	
	public static void main(String[] args) {
		
		List<Apple> linesOp2 = null;
		try {
			linesOp2 = FileUtils.readLines(pathname, Apple::new);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		linesOp2.forEach(System.out::println);
		
		
	}
}

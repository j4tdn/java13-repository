package inheritance.iinterface;

public class App {
	public static void main(String[] args) {
		Shape s1 = new Rectangel();
		Shape s2 = new Square();
		
		Shape s4 = new Shape() {
			
			@Override
			public void drawing() {
				System.out.println("Anonymuos class >> drawing....");
				
			}
		};
		s4.drawing();

		s1.drawing();
		s2.drawing();
		
//		Shape s3 = new Shape() {
//			//anonymuos class ( lớp ẩn danh) : là class không có tên
//			
//			@Override
//			public void drawing() {
//				System.out.println("Anonymuos class >> drawing....");
//				
//			}
//		};
		Shape s3 = new Anonymuos();
		s3.drawing();
		
}
}

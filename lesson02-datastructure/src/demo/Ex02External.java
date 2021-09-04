package demo;

public class Ex02External {
	public static void main(String[] args) {
//		Ex01TestVM.publicStaticMethod();
		// publicEx02Method();
		// non-static
		Ex01TestVM a = new Ex01TestVM();
		a.publicStaticMethod();

	}

	// static: khi goi ham thi lay ten class.[ten method]
	// non-static: tao 1 doi tuong de goi method
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}

}

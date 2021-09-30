package ex04;

public class View {
	public static void main(String[] args) {
		Person p1 = new Director("Minh", "19-2-2000", 3.5f, 2.0f);
		Person p2 = new Manager("Khai", "30-4-2000", 2.0f, 5.0f);
		Person p3 = new Employee("Giang", "10-6-2000", 1.5f, "Tai chinh");
		Person p4 = new Employee("tien", "30-4-2000", 1.7f, "Ke toan");
		
		System.out.println("so luong cua tung loai nhan su la");
		System.out.println("Giam doc: " + p1.salary());
		System.out.println("Truong phong: " + p2.salary());
		System.out.println("Hai Nhan vien: " + p3.salary() + ", " + p4.salary());
		
	}
}	

package inheritance.basic;

public class App {
	public static void main(String[] args) {
		Parent p1 = new Parent();  
		System.out.println(p1.digit); // 10
		System.out.println(p1.text); // parent
		p1.log(); // Parent logging // kiểu "Void" => ko có giá trị trả v�? nên ko sysout được
		
		Child c1 = new Child();
		System.out.println(c1.digit); // 20
		System.out.println(c1.text); // child 
		c1.log(); // Child logging
		
		Parent p2 = new Child();
		System.out.println(p2.digit); // 10 >> thuộc tính không đổi, vẫn lấy của PARENT
		System.out.println(p2.text); // parent >> nt
		p2.log(); // Child logging
		
		
	}

}

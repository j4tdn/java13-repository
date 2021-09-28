package ex01;
/*
 * Bài 1: Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB.
 * Tạo lớp Sinh viên như sau:
 * Attributes (private):
 * Mã sinh viên là số nguyên.
 * Họ tên: chuỗi ký tự.
 * Điểm LT, điểm TH : float
 * Constructor:
 * 
 * Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0, kiểu chuỗi
 * là chuỗi rỗng).
 * Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến
 * instance.
 * Methods:
 * 
 * Các phương thức getter và setter cho mỗi thuộc tính.
 * Tính điểm trung bình.
 * Phương thức toString để diễn tả thông tin của đối tượng ở dạng chuỗi.
 * 
 */
public class Students {
	private int id;
	private String name;
	private float  theoryPoint;
	private float practicePoint;
	
	public Students() {
	}

	public Students(int id, String name, float theoryPoint, float practicePoint) {
		super();
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	float avgPoint() {
		return (this.theoryPoint + this.practicePoint)/2;
	}

	@Override
	public String toString() {
		return "Student ID : "+ id + " ,name: " + name + " ,theoryPoint = " 
				+theoryPoint + " ,practicePoint = " + practicePoint + " ,avgPoint = "  
				+ avgPoint();
	}
	
	
}

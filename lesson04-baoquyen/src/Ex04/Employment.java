package Ex04;

/*
 * Bài 4: Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
 * a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
 * b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý
 * c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
 * Chương trình thực hiện các công việc sau đây.
 * 
 * Nhập dữ liệu gồm 1 Giám đốc, 1 Trưởng phòng, 2 Nhân viên
 * Hiển thị thông tin các nhân sự có trong công ty
 * Tính và in ra mức lương của từng loại nhân sự , biết rằng :
 * Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
 * Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
 * Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
 */
import java.time.LocalDate;

public abstract class Employment {
	protected String name;
	protected LocalDate dateOfBird;
	protected int CoefficientsSalary;
	
	public Employment() {
	}
	
	public Employment(String name, LocalDate dateOfBird, int coefficientsSalary) {
		this.name = name;
		this.dateOfBird = dateOfBird;
		CoefficientsSalary = coefficientsSalary;
	}
	
	abstract double salary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBird() {
		return dateOfBird;
	}

	public void setDateOfBird(LocalDate dateOfBird) {
		this.dateOfBird = dateOfBird;
	}

	public int getCoefficientsSalary() {
		return CoefficientsSalary;
	}

	public void setCoefficientsSalary(int coefficientsSalary) {
		CoefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "Employee name: " + name + ", dateOfBird: " + dateOfBird + ", CoefficientsSalary: " + CoefficientsSalary
				+ ", Salary: " + salary() ;
	}
	
	
}

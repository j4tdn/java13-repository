package ex04;

public class Employee extends People{
	private String nameDepart;
	
	public Employee() {
		
	}
	public Employee(String name, String birth, float idSalary, String nameDepart) {
		super(name, birth, idSalary);
		this.nameDepart = nameDepart;
	}
	
	public String getNameDepart() {
		return nameDepart;
	}
	public void setNameDepart(String nameDepart) {
		this.nameDepart = nameDepart;
	}
	@Override
	public String toString() {
		return super.toString()+", nameDepart: "+nameDepart;
	}
	@Override
	public long calSalary() {
		return (long)(getIdSalary()*1250000);
	}
	
	
}

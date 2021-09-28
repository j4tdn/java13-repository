package ex04;

public abstract class People {
	private String name;
	private String birth;
	private float idSalary;
	public People() {
		
	}
	public People(String name, String birth, float idSalary) {
		this.name = name;
		this.birth = birth;
		this.idSalary = idSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public float getIdSalary() {
		return idSalary;
	}
	public void setIdSalary(float idSalary) {
		this.idSalary = idSalary;
	}
	public abstract long calSalary();
	
	@Override
	public String toString() {
		return "name: "+name+", birthday: "+birth+", idSalary: "+idSalary;
	}
}

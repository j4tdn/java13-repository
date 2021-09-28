package ex04;

public class Manager extends People{
	private int amountEmploy;
	public Manager() {
		
	}
	public Manager(String name, String birth, float idSalary, int amountEmploy) {
		super(name, birth, idSalary);
		this.amountEmploy = amountEmploy;
	}
	
	public int getAmountEmploy() {
		return amountEmploy;
	}
	public void setAmountEmploy(int amountEmploy) {
		this.amountEmploy = amountEmploy;
	}
	@Override
	public String toString() {
		return super.toString()+", amountEmploy: "+amountEmploy;
	}
	@Override
	public long calSalary() {
		return (long)(getIdSalary()*2200000);
	}
	
	
}

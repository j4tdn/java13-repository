package ex04;

public class Director extends People{
	private float idPos;
	
	public Director() {
		
	}
	public Director(String name, String birth, float idSalary, float idPos) {
		super(name, birth, idSalary);
		this.idPos = idPos;
	}
	
	public float getIdPos() {
		return idPos;
	}
	public void setIdPos(float idPos) {
		this.idPos = idPos;
	}
	@Override
	public String toString() {
		return super.toString()+", idPos: "+idPos;
	}
	@Override
	public long calSalary() {
		return (long)((getIdSalary() + idPos)*3000000);
	}
	
	
}

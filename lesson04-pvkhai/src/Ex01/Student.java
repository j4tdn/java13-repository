package Ex01;

public class Student {
	private int id;
	private String name;
	private float theoMark;
	private float pracMark;
	
	public Student() {
		
	}

	public Student(int id, String name, float theoMark, float pracMark) {
		this.id = id;
		this.name = name;
		this.theoMark = theoMark;
		this.pracMark = pracMark;
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

	public float getTheoMark() {
		return theoMark;
	}

	public void setTheoMark(float theoMark) {
		this.theoMark = theoMark;
	}

	public float getPracMark() {
		return pracMark;
	}

	public void setPracMark(float pracMark) {
		this.pracMark = pracMark;
	}
	
	public float averMark() {
		return (this.pracMark + this.theoMark)/2;
	}
	
	@Override
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.theoMark + "\t" + this.pracMark + "\t" + averMark();
	}
}

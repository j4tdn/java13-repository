package persistence;

public class NumberItemDto {
	private Integer id;
	private String name;
	private Integer sum;
	public NumberItemDto(Integer id, String name, Integer sum) {
		super();
		this.id = id;
		this.name = name;
		this.sum = sum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "NumberItemDto [id=" + id + ", name=" + name + ", sum=" + sum + "]";
	}
	
}

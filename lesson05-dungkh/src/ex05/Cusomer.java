package ex05;

public class Cusomer {
	private int id;
	private String name;
	private String phone;
	private String address;
	
	public Cusomer() {
	}

	public Cusomer(int id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Cusomer [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	

}

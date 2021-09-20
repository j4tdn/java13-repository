package shopping;

public class Customer {
	private String id;
	private String name;
	private String phone;
	private String adsress;
	
	public Customer() {
	}

	public Customer(String id, String name, String phone, String adsress) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.adsress = adsress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdsress() {
		return adsress;
	}

	public void setAdsress(String adsress) {
		this.adsress = adsress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", adsress=" + adsress + "]";
	}
	
	
}

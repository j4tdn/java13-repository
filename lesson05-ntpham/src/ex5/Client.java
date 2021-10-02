
package ex5;

public class Client {
	private String idClient;
	private String fullName;
	private String phoneNumber;
	private String address;
	
	public Client() {
	}

	public Client(String idClient, String fullName, String phoneNumber, String address) {
		this.idClient = idClient;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return idClient + ", " + fullName + ", " + phoneNumber + ", " + address;
	}
	
	
}

package ex04;

public class Company {
	private People[] sumPeople;
	public Company() {
		
	}
	public Company(People[] people) {
		this.sumPeople = people;
	}
	
	void showEmployee() {
		for(int i=0; i<sumPeople.length;i++) {
			System.out.println(sumPeople[i]);
		}
	}
	void showSalary() {
		for(int i=0;i<sumPeople.length;i++) {
			System.out.println("name: "+sumPeople[i].getName()+", salary: "+sumPeople[i].calSalary());
		}
	}
}

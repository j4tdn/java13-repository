package service;

public class ClientService {
	private static ClientService INSTANCE = new ClientService();
	
	private ClientService() {
		
	}
	
	public static ClientService getInstance() {
		return INSTANCE;
	}
	
	public void test() {
		System.out.println("====> testing ...............");
	}
	
	public void initial() {
		System.out.println(">>>>>>>>>>>>>> ClientService#initial");
	}
	
	public void destroy() {
		System.out.println(">>>>>>>>>>>>>> ClientService#destroy");
	}
}

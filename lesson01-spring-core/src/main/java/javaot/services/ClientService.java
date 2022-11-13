package javaot.services;

public class ClientService {
    private ClientService(){

    }
    public static ClientService INSTANCE = new ClientService();
    public static ClientService getClientService(){
        return INSTANCE;
    }
    public static void logClient(){
        System.out.println("Client Logging!");
    }
    public static void destroyClient(){
        System.out.println("Destroy Client");
    }
    public static void initialClient(){
        System.out.println("Initial Client");
    }
}

package inheritance.abstractclass;

public interface Transformer extends AuthorizationService{
	void send(boolean safeMode); // encrypt
}

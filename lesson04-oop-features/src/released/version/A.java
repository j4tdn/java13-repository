package released.version;

public class A extends B {
	// transitive
	@Override
	public String toString() {
		return super.toString();
	}
}

package designer_partner_singleton.singleton;

public class Singleton {
	
	private static Singleton instancy;
	
	private Singleton() {
		super();
	}
	
	public static Singleton getInstancy() {
		if(instancy == null) {
			instancy = new Singleton();
		}
		return instancy;
	}
}

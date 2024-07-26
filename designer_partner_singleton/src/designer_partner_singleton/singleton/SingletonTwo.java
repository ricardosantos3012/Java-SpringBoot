package designer_partner_singleton.singleton;

public class SingletonTwo {

	private static SingletonTwo instancy = new SingletonTwo();
	
	private SingletonTwo() {
		super();
	}
	
	public static SingletonTwo getInstancy() {
		
		return instancy;
	}
}

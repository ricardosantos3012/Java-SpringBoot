package designer_partner_singleton.singleton;

public class SingletonThree {
	
	private static class InstancyHolder {
		public static SingletonThree instancy = new SingletonThree();
	}
	
	private SingletonThree() {
		super();
	}
	
	public static SingletonThree getInstancy() {
		
		return InstancyHolder.instancy;
	}
}
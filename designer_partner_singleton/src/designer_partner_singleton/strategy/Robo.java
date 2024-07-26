package designer_partner_singleton.strategy;

public class Robo {
	
	private Comportamento strategy;

	public void setStrategy(Comportamento strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
	}
}

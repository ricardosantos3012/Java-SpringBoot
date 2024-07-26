package designer_partner_singleton.strategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se de forma agressiva");
	}

}

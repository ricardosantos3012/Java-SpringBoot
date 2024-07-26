package designer_partner_singleton.singleton;

import designer_partner_singleton.facade.Facade;
import designer_partner_singleton.strategy.*;
public class Test {

	public static void main(String[] args) {
		
		/*Singleton one = Singleton.getInstancy();
		System.out.println(one);
		one = Singleton.getInstancy();
		System.out.println(one);
		
		SingletonTwo two = SingletonTwo.getInstancy();
		System.out.println(two);
		two = SingletonTwo.getInstancy();
		System.out.println(two);
		
		SingletonThree three = SingletonThree.getInstancy();
		System.out.println(three);
		three = SingletonThree.getInstancy();
		System.out.println(three);*/
		
		/*Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robozinho = new Robo();
		
		robozinho.setStrategy(normal);
		robozinho.mover();
		
		robozinho.setStrategy(defensivo);
		robozinho.mover();
		
		robozinho.setStrategy(agressivo);
		robozinho.mover();*/
		
		Facade facade = new Facade();
		
		facade.migrarCliente("Ricardo", "88215-000");
		
	}

}

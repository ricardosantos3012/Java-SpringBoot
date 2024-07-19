package dio.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
 class MyApp implements CommandLineRunner {
	
	@Autowired
	private Calculadora calculadora;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.print("O resultado da soma é: " + calculadora.somar(2, 4));
		
	}
	
}

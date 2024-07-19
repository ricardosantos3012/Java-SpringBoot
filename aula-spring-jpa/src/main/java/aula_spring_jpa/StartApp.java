package aula_spring_jpa;

import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import model.User;

@Component
public class StartApp implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		
		user.setName("Ricardo");
		user.setUserName("ricardosantos37");
		user.setPassword("emanuel3012");
		
		repository.save(user);
		
		for(User u : repository.findAll()) {
			System.out.println(u);
		}
	}
	
}

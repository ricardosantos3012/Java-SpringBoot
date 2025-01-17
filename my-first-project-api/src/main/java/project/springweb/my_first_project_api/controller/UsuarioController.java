package project.springweb.my_first_project_api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.springweb.my_first_project_api.model.Usuario;
import project.springweb.my_first_project_api.repository.UsuarioRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping()
	public List<Usuario> getUsers() {
		return repository.findAll();
	}
	
	@GetMapping("/{userName}")
	public Usuario getOne(@PathVariable("userName") String userName) {
		return repository.findByUserName(userName);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PostMapping()
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}

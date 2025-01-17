package project.springweb.my_first_project_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import project.springweb.my_first_project_api.model.Usuario;

@Repository
public class UsuarioRepository {
	
	public void save(Usuario usuario) {
		if(usuario.getId()==null) {
			System.out.println("Save - Recebendo o usuário na camada repositório.");
		} else {
			System.out.println("Update - Recebendo o usuário na camada de repositório.");
		}
		
		System.out.println(usuario);
	}
	
	public void deleteById(Integer id) {
		System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuário.", id));
		System.out.println(id);
	}
	
	
	public List<Usuario> findAll() {
		System.out.println("List - Listando os usuarios do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Ricardo", "30122018"));
		usuarios.add(new Usuario("Heloisa", "27102013"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("Find/id - Recebendo o id: %d para localizar um usuário.", id));
		return new Usuario("Ricardo", "30122018");
	}
	
	public Usuario findByUserName(String userName) {
		System.out.println(String.format("Find/userName - Recebendo user name: %s para exibir um usuário.", userName));
		return new Usuario("Ricardo", "30122018");
	}
	
	
    
}

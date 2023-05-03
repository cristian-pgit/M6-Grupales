package cl.bdly.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bdly.modelo.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsernameAndPassword(String username, String password);
	
	Usuario findByUsername(String username);

}

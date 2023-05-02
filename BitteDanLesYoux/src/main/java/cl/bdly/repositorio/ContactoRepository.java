package cl.bdly.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bdly.modelo.Contacto;

@Repository("contactoRepository")
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

	
	
}

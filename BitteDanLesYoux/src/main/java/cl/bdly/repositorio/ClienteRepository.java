package cl.bdly.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.bdly.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

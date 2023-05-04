package cl.bdly.repositorio;

import cl.bdly.modelo.Pago;
import cl.bdly.repositorio.PagoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
}
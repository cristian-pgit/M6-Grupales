package cl.bdly.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bdly.modelo.Capacitacion;
import cl.bdly.repositorio.CapacitacionRepository;

@Service
@Transactional
public class CapacitacionService {
	
	@Autowired
	public CapacitacionRepository capaRepository;
	
	public void save(Capacitacion capa) {
		capaRepository.save(capa);
	}
	
	public List<Capacitacion> obtenerCapacitciones(){
		return capaRepository.findAll();
	}

}

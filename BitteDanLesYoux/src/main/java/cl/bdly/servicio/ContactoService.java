package cl.bdly.servicio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bdly.modelo.Contacto;
import cl.bdly.repositorio.ContactoRepository;

@Service
@Transactional
public class ContactoService {
	
	@Autowired
	public ContactoRepository contactRepository;
	
	
	public void save(Contacto contacto) {
		contactRepository.save(contacto);
	}

}

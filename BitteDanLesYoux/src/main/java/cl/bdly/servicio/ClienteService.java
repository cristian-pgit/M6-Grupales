package cl.bdly.servicio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bdly.modelo.Cliente;
import cl.bdly.repositorio.ClienteRepository;

@Service
@Transactional
public class ClienteService {
	
	@Autowired
	public ClienteRepository cliRepository;
	
	public void crearCliente(Cliente cli) {
		cliRepository.save(cli);
	}
	
	public List<Cliente> obtenerClientes(){
		return cliRepository.findAll();
	}
	
	

}

package cl.bdly.bdly.dao;

import java.util.List;

import cl.bdly.bdly.models.Cliente;


public interface IClienteDao {
	
	public Cliente getClienteById(int idUsuario);
	public List<Cliente> getAllClientes();
	public int deleteCliente(Integer idUsuario);
	public void crearCliente(Cliente cliente);
	public void updateCliente(Cliente cliente, int idUsuario);

}

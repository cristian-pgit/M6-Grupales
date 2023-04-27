package cl.bdly.bdly.dao;

import java.util.List;

import cl.bdly.bdly.models.Contacto;



public interface IContactoDao {
	
	public List<Contacto> getAllMensajes();
	public void insertContacto (String nombres, String apellidos, String email, int telefono, String mensaje);

}

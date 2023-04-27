package cl.bdly.bdly.dao;

import java.util.List;

import cl.bdly.bdly.models.Usuario;

public interface IUsuarioDao {

	public Usuario getUsuarioById(int idUsuario);
	public Usuario getUsuarioByUsernameAndPassword(String userName, String password);
	public List<Usuario> getAllUsuario();
	public int deleteUsuario(Integer idUsuario);
	public void crearUsuario(Usuario user);
	public void updateUsuario(Usuario user, int idUsuario);
	
}

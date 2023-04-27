package cl.bdly.bdly.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.bdly.bdly.dao.IUsuarioDao;
import cl.bdly.bdly.mappers.UsuarioRowMapper;
import cl.bdly.bdly.models.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao {
	
	private JdbcTemplate jdbcTemp;
	
	public UsuarioDaoImpl(DataSource  dataSource	) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}

	@Override
	public Usuario getUsuarioById(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuarioByUsernameAndPassword(String userName, String password) {
		String sql = "SELECT idUsuario, userName, password, fNacimiento, run, perfil FROM usuario WHERE userName =? AND password=?";
		Object[] params = {userName, password};
		Usuario user = jdbcTemp.queryForObject(sql, params, new UsuarioRowMapper());
		return user;
	}

	@Override
	public List<Usuario> getAllUsuario() {
		String sql = "SELECT idUsuario, userName, password, fNacimiento, run, perfil FROM usuario";
		List<Usuario> user = jdbcTemp.query(sql, new UsuarioRowMapper());
		
		return user;
	}

	@Override
	public int deleteUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void crearUsuario(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUsuario(Usuario user, int idUsuario) {
		// TODO Auto-generated method stub
		
	}
	
	

}

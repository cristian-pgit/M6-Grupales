package cl.bdly.bdly.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bdly.bdly.models.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario user = new Usuario();
		user.setIdUsuario(rs.getInt("idUsuario"));
		user.setUserName(rs.getString("userName"));
		user.setPassword("password");
		user.setfNacimiento(rs.getDate("fNacimiento"));
		user.setRun(rs.getInt("run"));
		user.setPerfil(rs.getNString("perfil"));
		return user;
	}
	
	

}

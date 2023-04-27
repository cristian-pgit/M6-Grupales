package cl.bdly.bdly.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bdly.bdly.models.Contacto;

public class ContactoRowMapper implements RowMapper<Contacto> {

	@Override
	public Contacto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contacto con = new Contacto();
		con.setNombres(rs.getString("nombres"));
		con.setApellidos(rs.getString("apellidos"));
		con.setEmail(rs.getString("email"));
		con.setTelefono(rs.getInt("telefono"));
		con.setMensaje(rs.getString("mensaje"));
		
		return con;
	}

}

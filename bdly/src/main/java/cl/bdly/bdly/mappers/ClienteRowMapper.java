package cl.bdly.bdly.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bdly.bdly.models.Cliente;


public class ClienteRowMapper implements RowMapper<Cliente> {
	
	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente cli = new Cliente();
		cli.setIdUsuario(rs.getInt(1));
		cli.setUserName(rs.getString(2));
		cli.setfNacimiento(rs.getDate(3));
		cli.setRun(rs.getInt(4));
		cli.setRutCliente(rs.getInt(5));
		cli.setNombres(rs.getString(6));
		cli.setApellidos(rs.getString(7));
		cli.setFono(rs.getInt(8));
		cli.setAfp(rs.getString(9));
		cli.setSds(rs.getInt(10));
		cli.setDireccion(rs.getString(11));
		cli.setComuna(rs.getString(12));
		cli.setEdad(rs.getInt(13));
			
		return cli;
	}

}

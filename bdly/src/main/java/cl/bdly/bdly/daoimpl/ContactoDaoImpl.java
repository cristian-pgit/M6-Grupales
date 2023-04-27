package cl.bdly.bdly.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.bdly.bdly.dao.IContactoDao;
import cl.bdly.bdly.mappers.ContactoRowMapper;
import cl.bdly.bdly.models.Contacto;

public class ContactoDaoImpl implements IContactoDao {
	
	private JdbcTemplate jdbcTemp;
	
	public ContactoDaoImpl(DataSource  dataSource	) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Contacto> getAllMensajes() {
		String sql = "SELECT nombres, apellidos, email, telefono, mensaje FROM contacto";
		List<Contacto> cli = jdbcTemp.query(sql, new ContactoRowMapper());
		
		return cli;
	}

	@Override
	public void insertContacto(String nombres, String apellidos, String email, int telefono, String mensaje) {
		String sql = "INSERT INTO contacto (nombres, apellidos, email, telefono, mensaje) VALUES "
				  + "(?,?,?,?,?)"; 
		  Object[] params = {nombres, apellidos, email, telefono, mensaje}; 
		  int rowsAffected = jdbcTemp.update(sql, params);
	}
	


}

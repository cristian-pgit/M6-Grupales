package cl.bdly.bdly.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.bdly.bdly.dao.IClienteDao;
import cl.bdly.bdly.mappers.ClienteRowMapper;
import cl.bdly.bdly.models.Cliente;

public class ClienteDaoImpl implements IClienteDao {
	
	private JdbcTemplate jdbcTemp;
	
	public ClienteDaoImpl(DataSource  dataSource	) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}

	@Override
	public Cliente getClienteById(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAllClientes() {
		String sql = "SELECT u.idUsuario, u.userName, u.fNacimiento, u.run, c.RutCliente, c.Nombres, c.Apellidos, c.telefono, c.Afp, c.SistemaDeSAlud, c.Direccion, c.Comuna, c.Edad  FROM usuario u JOIN cliente c ON u.idUsuario = c.id_Usuario;";
		List<Cliente> cli = jdbcTemp.query(sql, new ClienteRowMapper());
		
		return cli;
	}

	@Override
	public int deleteCliente(Integer idUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCliente(Cliente cliente, int idUsuario) {
		// TODO Auto-generated method stub
		
	}
	

}

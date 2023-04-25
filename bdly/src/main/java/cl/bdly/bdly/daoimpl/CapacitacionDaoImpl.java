package cl.bdly.bdly.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cl.bdly.bdly.dao.CapacitacionDao;
import cl.bdly.bdly.models.Capacitacion;
import cl.bdly.bdly.mappers.CapacitacionRowMapper;


public class CapacitacionDaoImpl implements CapacitacionDao {

	
	private JdbcTemplate jdbcTemp;
	
	public CapacitacionDaoImpl(DataSource  dataSource	) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public Capacitacion getCapacitacionByIdCapacitacion(Integer idCapa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Capacitacion> getAllCapacitaciones() {
		String sql = "SELECT idcapacitacion, rut_Cliente, dia, hora, lugar, duracion, cantAsistentes, nombre_capacitacion FROM capacitacion";
		List<Capacitacion> capas = jdbcTemp.query(sql, new CapacitacionRowMapper() );
		
		return capas;
	}

	@Override
	public int deleteCapacitacion(Integer idCapa) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCapacitacion(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	  @Override 
	  public void insertCapacitacion(int idcapa, int rutcliente, String dia, String hora, String lugar, int duracion, int cantAsist, String nomCapa) { 
		  String sql = "INSERT INTO capacitacion (idcapacitacion, rut_Cliente, dia, hora, lugar, duracion, cantAsistentes, nombre_capacitacion VALUES "
				  + "(?,?,?,?,?,?,?,?,?,?)"; Object[] params = {idcapa, rutcliente, dia, hora, lugar, duracion, cantAsist, nomCapa}; 
				  Capacitacion capa = jdbcTemp.queryForObject(sql, params, new CapacitacionRowMapper());
	  }
	 


	

}

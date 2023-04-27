package cl.bdly.bdly.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import cl.bdly.bdly.dao.ICapacitacionDao;
import cl.bdly.bdly.models.Capacitacion;
import cl.bdly.bdly.mappers.CapacitacionRowMapper;


public class CapacitacionDaoImpl implements ICapacitacionDao {

	
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
	public List<Capacitacion> obtenerCapacitaciones() {
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
	  public boolean crearCapacitacion(Capacitacion capa) { 
		  String sql = "INSERT INTO capacitacion (idcapacitacion, rut_Cliente, dia, hora, lugar, duracion, cantAsistentes, nombre_capacitacion) VALUES "
				  + "(?,?,?,?,?,?,?,?)"; 
		// int nextId = jdbcTemp.queryForObject("SELECT MAX(idcapacitacion) + 1 FROM capacitacion", Integer.class);
		  Object[] params = {capa.getIdCapacitacion(), capa.getRutCliente(), capa.getDia(), capa.getHora(), capa.getLugar(), 
				  capa.getDuracion(), capa.getCantAsist(), capa.getNomCapa()}; 
		  try {
		        int rowsAffected = jdbcTemp.update(sql, params);
		        System.out.println("se inserto "+ rowsAffected + " fila");
		        return true;
		    } catch (DuplicateKeyException e) {
		        // Handle the exception appropriately, such as retrying with a different primary key value or logging an error message
		        System.out.println("Error: Duplicate primary key value found.");
		        return false;
		    }
	  }
	 


	

}

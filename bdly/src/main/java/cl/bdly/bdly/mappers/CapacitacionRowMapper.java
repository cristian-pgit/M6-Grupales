package cl.bdly.bdly.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.bdly.bdly.models.Capacitacion;

public class CapacitacionRowMapper implements RowMapper<Capacitacion> {

	@Override
	public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Capacitacion capa = new Capacitacion();
		capa.setIdCapacitacion(rs.getInt("idcapacitacion"));
		capa.setRutCliente(rs.getInt("rut_Cliente"));
		capa.setDia(rs.getString("dia"));
		capa.setHora(rs.getString("hora"));
		capa.setLugar(rs.getString("lugar"));
		capa.setDuracion(rs.getInt("duracion"));
		capa.setCantAsist(rs.getInt("cantAsistentes"));
		capa.setNomCapa(rs.getString("nombre_capacitacion"));
			
		return capa;
	}

	
}

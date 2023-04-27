package cl.bdly.bdly.dao;

import java.util.List;

import cl.bdly.bdly.models.Capacitacion;



public interface ICapacitacionDao {
	
	public Capacitacion getCapacitacionByIdCapacitacion(Integer idCapa);
	public List<Capacitacion> obtenerCapacitaciones();
	public int deleteCapacitacion(Integer idCapa);
	public int updateCapacitacion(Capacitacion capacitacion);
	public boolean crearCapacitacion(Capacitacion capa);

}

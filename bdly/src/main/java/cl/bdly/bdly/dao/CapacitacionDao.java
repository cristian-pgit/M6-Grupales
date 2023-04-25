package cl.bdly.bdly.dao;

import java.util.List;

import cl.bdly.bdly.models.Capacitacion;



public interface CapacitacionDao {
	
	public Capacitacion getCapacitacionByIdCapacitacion(Integer idCapa);
	public List<Capacitacion> getAllCapacitaciones();
	public int deleteCapacitacion(Integer idCapa);
	public int updateCapacitacion(Capacitacion capacitacion);
	public void insertCapacitacion(int idcapa, int rutcliente, String dia, String hora, String lugar, int duracion, int cantAsist, String nomCapa);

}

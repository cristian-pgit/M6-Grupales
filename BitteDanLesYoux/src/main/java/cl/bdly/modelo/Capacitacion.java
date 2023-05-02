package cl.bdly.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name="capacitacion")
public class Capacitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_capacitacion", nullable=false)
	private Integer idCapacitacion;
	
	@Column
	private Integer rutCliente;
	
	@Column(name = "dia_capacitacion")
	private String dia;
	
	@Column(name = "hora_capacitacion")
	private String hora;
	
	@Column(name = "lugar_capacitacion", nullable=false)
	@Size(min=10, max=50)
	private String lugar;
	
	@Column(name = "duracion_capacitacion")
	@Size(max=70)
	private String duracion;
	
	@Column(name = "cantidad_asistentes", nullable=false)
	@Max(999)
	private Integer cantAsis;
	
	@Column(name = "nombre_capacitacion")
	private String nomCapa;

	public Integer getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Integer getCantAsis() {
		return cantAsis;
	}

	public void setCantAsis(Integer cantAsis) {
		this.cantAsis = cantAsis;
	}

	public String getNomCapa() {
		return nomCapa;
	}

	public void setNomCapa(String nomCapa) {
		this.nomCapa = nomCapa;
	}

	
}

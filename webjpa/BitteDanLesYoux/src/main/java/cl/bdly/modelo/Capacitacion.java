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

}

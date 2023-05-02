package cl.bdly.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(name = "rut_cliente")
	@Max(99999999)
	private Integer rutCliente;
	
	@Column(name = "nombres", nullable=false)
	@Size(min=5, max=30)
	private String nombres;
	
	@Column(name = "apellidos", nullable=false)
	@Size(min=5, max=30)
	private String apellidos;
	
	@Column(name = "telefono")
	private Integer fono;
	
	@Column(name = "afp")
	@Size(min=4, max=30)
	private String afp;
	
	@Column(name = "sistema_salud")
	@Max(2)
	private Integer sds;
	
	@Column(name = "direccion")
	@Size(max=70)
	private String direccion;
	
	@Column(name = "comuna")
	@Size(max=50)
	private String comuna;
	
	@Column(name = "edad")
	@Max(150)
	private Integer edad;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_usuario", nullable=false) 
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getFono() {
		return fono;
	}

	public void setFono(Integer fono) {
		this.fono = fono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Integer getSds() {
		return sds;
	}

	public void setSds(Integer sds) {
		this.sds = sds;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	
}

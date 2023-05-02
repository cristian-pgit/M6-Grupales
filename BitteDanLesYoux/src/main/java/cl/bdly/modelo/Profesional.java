package cl.bdly.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "profesional")
public class Profesional {
	
	@Id
	@Column(name = "id_profesional")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfesional;
	
	@Column(name = "titulo_profesional", nullable=false)
	@Size(min=10, max=50)
	private String titulo;
	
	@Column(name = "fecha_ingreso")
	private Date fechaIng;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_usuario", nullable=false) 
	private Usuario usuario;
	
	public Integer getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(Integer idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(Date fechaIng) {
		this.fechaIng = fechaIng;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	

}

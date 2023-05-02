package cl.bdly.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(name = "username", nullable=false, unique=true)
	@Size(min=10, max=50)
	private String username;
	
	@Column(name = "password", nullable=false, unique=true)
	private String password;
	
	@Column(name = "fecha_nacimiento", nullable=false)
	private Date fechaNacimiento;
	
	@Column(name = "run", nullable=false, unique=true)
	private Integer run;
	
	@Column(name = "perfil_usuario", nullable=false)
	private String perfil;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	

}

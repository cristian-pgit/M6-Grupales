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
import javax.validation.constraints.Size;

@Entity
@Table(name = "administrativo")
public class Administrativo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_administrativo")
	private Integer idAdministrativo;
	
	@Column(name = "area", nullable=false)
	@Size (min = 5, max = 20)
	private String area;
	
	@Column(name = "experiencia_previa", length=100)
	private String exPre;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_usuario", nullable=false) 
	private Usuario usuario;
	
	public Integer getIdAdministrativo() {
		return idAdministrativo;
	}

	public void setIdAdministrativo(Integer idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExPre() {
		return exPre;
	}

	public void setExPre(String exPre) {
		this.exPre = exPre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}

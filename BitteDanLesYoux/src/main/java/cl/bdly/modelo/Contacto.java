package cl.bdly.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contacto")
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contacto", nullable=false)
	private Integer idContacto;
	
	@Column(name = "nombre_contacto")
	private String contactName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefono")
	private Integer telefono;
	
	@Column(name = "mensaje")
	@Size(max = 500)
	private String mensaje;

	public Integer getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	public String getContacName() {
		return contactName;
	}

	public void setContacName(String contacName) {
		this.contactName = contacName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [idContacto=");
		builder.append(idContacto);
		builder.append(", contacName=");
		builder.append(contactName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", Mensaje=");
		builder.append(mensaje);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}

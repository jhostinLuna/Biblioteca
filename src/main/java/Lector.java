import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

@DynamicUpdate
@Table(appliesTo = "lector")
public class Lector {
	@Id @GeneratedValue
	private int id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String email;
	
	public Lector() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

@DynamicUpdate
@Table(appliesTo = "prestamo")
public class Prestamo {
	@Column @GeneratedValue
	private int id;
	@Column
	private String fechaPrestamo;
	@Column
	private String fechaDevoluvion;
	@Column
	private int idLibro;
	@Column
	private int idLector;
	public Prestamo() {
		// TODO Auto-generated constructor stub
	}
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public String getFechaDevoluvion() {
		return fechaDevoluvion;
	}
	public void setFechaDevoluvion(String fechaDevoluvion) {
		this.fechaDevoluvion = fechaDevoluvion;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdLector() {
		return idLector;
	}
	public void setIdLector(int idLector) {
		this.idLector = idLector;
	}

}

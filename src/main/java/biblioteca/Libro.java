package biblioteca;


public class Libro{
	private Integer id;
	private String titulo;
	private String autor;
	private Integer anioPublicacion;
	private boolean disponible;
	public Libro() {
	}
	public Libro(Integer id, String titulo, String autor, Integer anioPublicacion, boolean disponible) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.disponible = disponible;
	}
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getPublicacion() {
		return anioPublicacion;
	}
	public void setPublicacion(Integer publicacion) {
		this.anioPublicacion = publicacion;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion
				+ ", disponible=" + disponible + "]";
	}
	

}

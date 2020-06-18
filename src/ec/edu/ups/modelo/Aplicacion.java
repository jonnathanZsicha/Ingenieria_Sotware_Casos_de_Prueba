package ec.edu.ups.modelo;

public class Aplicacion {

	private String descripcion;
	private Apartado apartado;
	private IniciarSesion iniciarSesion;

	public Aplicacion() {

	}

	public Aplicacion(String descripcion, Apartado apartado, IniciarSesion iniciarSesion) {
		this.descripcion=descripcion;
		this.apartado=apartado;
		this.iniciarSesion=iniciarSesion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Apartado getApartado() {
		return apartado;
	}

	public void setApartado(Apartado apartado) {
		this.apartado = apartado;
	}

	public IniciarSesion getIniciarSesion() {
		return iniciarSesion;
	}

	public void setIniciarSesion(IniciarSesion iniciarSesion) {
		this.iniciarSesion = iniciarSesion;
	}

	public String VerificarRol () {
		return null;
	}
	
	public boolean  VerificarSesion () {
		return true;
	}
}

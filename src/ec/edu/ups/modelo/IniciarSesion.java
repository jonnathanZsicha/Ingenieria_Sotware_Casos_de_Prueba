package ec.edu.ups.modelo;

public class IniciarSesion {
	private String correo, contrasenia;
	private Usuario usuario;
	
	public IniciarSesion() {
		// TODO Auto-generated constructor stub
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public boolean verificarCredenciales() {
		return true;
	}
	
	public boolean asignarRol() {
		return true; 
	}
	
	public boolean crearSesion() {
		return true;
	}
	
	
}

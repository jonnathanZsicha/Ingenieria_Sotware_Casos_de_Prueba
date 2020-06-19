package ec.edu.ups.modulo1.modelo;

public class Usuario {
	
	private String nombre,apellido,cedula,celular,rol; 
	private boolean sesion;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String nombre,String apellido,String cedula,String celular,String rol, Boolean sesion) {
		this.nombre=nombre; 
		this.apellido=apellido; 
		this.cedula=cedula;
		this.celular=celular; 
		this.rol=rol;
		this.sesion=sesion; 
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isSesion() {
		return sesion;
	}

	public void setSesion(boolean sesion) {
		this.sesion = sesion;
	}
	
	
	

}



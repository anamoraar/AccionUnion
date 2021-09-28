import java.util.ArrayList;

public class Organizacion {
	
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Evento> eventos;
	
	public Organizacion(String nombre) {
		this.nombre = nombre;
		this.usuarios = new ArrayList<Usuario>();
		this.eventos = new ArrayList<Evento>();
	}
	
	public void agregarVoluntario(String nombreCompleto, String telefono, String correoElectronico) {
		Voluntario v1 = new Voluntario(nombreCompleto, telefono, correoElectronico);
		usuarios.add(v1);
	}
	
	public Organizador agregarOrganizador(String nombreCompleto, String telefono, String correoElectronico) {
		Organizador o1 = new Organizador(nombreCompleto, telefono, correoElectronico);
		usuarios.add(o1);
		return o1;
	}
	
	public Usuario getUsuario(int indice) {
		return this.usuarios.get(indice);
	}
}

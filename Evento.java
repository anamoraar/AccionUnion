import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
	//Atributos
	private String nombre;
	private int id;
	private static int contadorEventos = 1;
	
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	//Constructores
	public Evento(String nombre) {
		this.nombre = nombre;
		this.id = contadorEventos++;
	}
	
	public Evento(String nombre, String inicio, String fin) {
		this.nombre = nombre;
		this.id = contadorEventos++;
		this.inicio = LocalDateTime.parse(inicio, formato);
		this.fin = LocalDateTime.parse(fin, formato);
		
	}
	//Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	//Sobreescritos
	@Override
	public String toString(){
		String info = this.id+". "+this.nombre;
		if(this.inicio != null && this.fin != null) {
			info += " (" + this.inicio.format(formato) + " - " + this.fin.format(formato) + ")";
		}
		return info;
	}

}


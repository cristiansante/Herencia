
public abstract class JugadoresEquipo extends Deportistas{
	
	private String nombreEquipo;
	protected double sueldo;

	public JugadoresEquipo(String nombre, int peso, int altura, String deporte, String nombreEquipo) {
		super(nombre, peso, altura, deporte);
		this.nombreEquipo = nombreEquipo;
		this.sueldo=50000;
		
	}

	abstract public double DineroGanado();	

	
	public String toString() {
		
		String s = super.toString();
		
		s = s + ", nombre de equipo= "+ this.nombreEquipo;
		
		return s;
	}
}


public class Futbolistas extends JugadoresEquipo{
	
	private String puesto;
	private int premioPartidoGanado=15000;

	public Futbolistas(String nombre, int peso, int altura, String deporte, String nombreEquipo, String puesto) {
		super(nombre, peso, altura, deporte, nombreEquipo);
		this.puesto=puesto;
	}

	@Override
	public double DineroGanado() {
		if(ganoPartido()) {
			return sueldo + premioPartidoGanado;
		}
		else {
			return sueldo;
		}	
	}
	
	public boolean ganoPartido() {
		return true;
	}

	@Override
	public String toString() {
		
		String s = super.toString();
		
		s= s + ", puesto= "+puesto;
		
		return s;
	}
}

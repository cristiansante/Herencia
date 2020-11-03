                                         
public class Boxeadores extends Deportistas{
	
	private String categoria;
	private double recaudacion=80000; //supongamos que es este monto

	public Boxeadores(String nombre, int peso, int altura, String deporte,String categoria) {
		super(nombre, peso, altura, deporte);
		this.categoria=categoria;
	}
	
	@Override
	public double DineroGanado() {
		return recaudacion *70/100;
	}
	
	public String toString(){
		String s = super.toString();
		
		s= s + ", categoria= "+ this.categoria;
		
		return s;
	}
}

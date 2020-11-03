
public class Tenistas extends Deportistas{
	
	private int ranking;
	private double premio=250000;

	public Tenistas(String nombre, int peso, int altura, String deporte, int ranking) {
		super(nombre, peso, altura, deporte);
		this.ranking=ranking;
	}

	@Override
	public double DineroGanado() {
		return premio;	
	}
	
	public String toString() {
		
		String s= super.toString();
		
		s= s + ", ranking= "+ranking;
		
		return s;
	}
}


public abstract class Deportistas {
	
	private String nombre;
	private int peso;
	private int altura;
	private String deporte;
	
	public Deportistas(String nombre,int peso,int altura,String deporte){
		this.nombre = nombre;
		this.peso=peso;
		this.altura=altura;
		this.deporte=deporte;
	}
		
	abstract public double DineroGanado();

	@Override
	public String toString() {
		return "nombre= " + nombre + ", peso= " + peso + ", altura= " + altura + ", deporte= " + deporte;
	}
}

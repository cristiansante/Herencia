
public class prueba {

	public static void main(String[] args) {


		Boxeadores b = new Boxeadores("Canelo", 80, 184, "boxeador", "pesado");
		Futbolistas f = new Futbolistas("Messi", 70, 168, "Futbolista", "Barcelona","delantero");
		Tenistas t = new Tenistas("Nalbandian", 80, 180, "tenista", 3);
		
		
		//b.DineroGanado(8000);
		//t.DineroGanado(5000);

		System.out.println(f.DineroGanado());
		
		System.out.println(b.toString());
		System.out.println(t.toString());
		System.out.println(f.toString());
		
		//System.out.println(b.dinero);
		//System.out.println(b.nombre);

	}

}

package projeto_maratona;

public class Principal {

	public static void main(String[] args) {
	
			Maratona jose = new AtletaAmador("Jose","M",22,1.80,false);
			jose.toString();
			System.out.println(jose.toString()); 
			
			Maratona eduardo = new AtletaProfissional("Eduardo", "M", 23, 1.72, 70.0);
			System.out.println(eduardo);
			
	}
}

package exercicios;

public class Main {

	public static void main(String[] args) {
		//String empresa, double valor, double valoriss, String nome, int crm
		Plano medico = new Medico("Plano",80.00,0.05,"Eduardo",3);
		Plano anestesista = new Anestesista("Plano",80.00,0.05,"Eduardo",3,"Na testa");
		Plano clinica = new Clinica("Plano",80.00,0.05,"Eduardo","bla");
		System.out.println("O valor a ser pago é: "+medico.calcularPagamento());
		System.out.println("O valor a ser pago é: "+anestesista.calcularPagamento());
		System.out.println("Valor a ser pago é:"+ clinica.calcularPagamento());
		System.out.println("\n"+medico.toString());
		System.out.println(anestesista.toString());
		System.out.println(clinica.toString());
		
		ControlePagamento pgtoTotal = new ControlePagamento();
		
		pgtoTotal.calcularTotalpago(medico);
		pgtoTotal.calcularTotalpago(anestesista);
		pgtoTotal.calcularTotalpago(clinica);
		
		System.out.println("\n" + pgtoTotal.getTotalPago());
	}

}

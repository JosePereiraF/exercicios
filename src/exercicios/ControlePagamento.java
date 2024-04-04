package exercicios;

public class ControlePagamento {
	private double totalPago;
	
	public double getTotalPago() {
		return totalPago;
	}
	
	public void calcularTotalpago(Plano pago1) {
		this.totalPago += pago1.calcularPagamento();
	}
}

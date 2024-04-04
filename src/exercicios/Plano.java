package exercicios;

public class Plano {
	

	private String empresa;
	private double valor= 80.00;
	private double valoriss;
	
	public Plano(String empresa, double valor, double valoriss) {
		super();
		this.empresa = empresa;
		this.valor = valor;
		this.valoriss = valoriss;
	}
	
	public void compara() {
		String resposta = "a";
		if(resposta=="a") {
			System.out.println("deu certo");
		}else {
			System.out.println("deu errado");
		}
	}
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValoriss() {
		return valoriss;
	}
	
	public void setValoriss(double valoriss) {
		this.valoriss = valoriss;
	}
	public double calcularPagamento() {
		/*
		 O plano paga como valor inicial R$80,00 #valorPago de consulta para o médico, anestesista ou clínica.
▪ 		 O desconto inicial do valor de ISS #valorIss é de 5%
		 */
		double valor =this.valor*0.95;
		
		return valor;
		
		
	}
	
	@Override
	public String toString() {
		return "Plano [empresa=" + empresa + ", valor=" + valor + ", valoriss=" + valoriss + ", getEmpresa()="
				+ getEmpresa() + ", getValor()=" + getValor() + ", getValoriss()=" + getValoriss() + "]";
	}
	
	
}

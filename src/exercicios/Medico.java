package exercicios;

public class Medico extends Plano{
	private String nome;
	private int crm;
	public Medico(String empresa, double valor, double valoriss, String nome, int crm) {
		super(empresa, valor, valoriss);
		this.nome = nome;
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + ", getNome()=" + getNome() + ", getCrm()=" + getCrm()
				+ ", getEmpresa()=" + getEmpresa() + ", getValor()=" + getValor() + ", getValoriss()=" + getValoriss()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public double calcularPagamento() {
		double valor = super.calcularPagamento()*1.10;
		return valor;
	}
	
	
	
}

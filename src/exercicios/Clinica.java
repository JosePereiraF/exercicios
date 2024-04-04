package exercicios;

public class Clinica extends Plano{
	private String nome;
	private String cgc;
	public Clinica(String empresa, double valor, double valoriss, String nome, String cgc) {
		super(empresa, valor, valoriss);
		this.nome = nome;
		this.cgc = cgc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	@Override
	public String toString() {
		return "Clinica [nome=" + nome + ", cgc=" + cgc + ", getNome()=" + getNome() + ", getCgc()=" + getCgc()
				+ ", getEmpresa()=" + getEmpresa() + ", getValor()=" + getValor() + ", getValoriss()=" + getValoriss()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

package exercicios;

public class Anestesista extends Medico{
	private String tipo_anestesia;

	public Anestesista(String empresa, double valor, double valoriss, String nome, int crm, String tipo_anestesia) {
		super(empresa, valor, valoriss, nome, crm);
		this.tipo_anestesia = tipo_anestesia;
	}

	public String getTipo_anestesia() {
		return tipo_anestesia;
	}

	public void setTipo_anestesia(String tipo_anestesia) {
		this.tipo_anestesia = tipo_anestesia;
	}

	@Override
	public String toString() {
		return "Anestesista [tipo_anestesia=" + tipo_anestesia + ", getTipo_anestesia()=" + getTipo_anestesia()
				+ ", getNome()=" + getNome() + ", getCrm()=" + getCrm() + ", toString()=" + super.toString()
				+ ", getEmpresa()=" + getEmpresa() + ", getValor()=" + getValor() + ", getValoriss()=" + getValoriss()
				+ "]";
	}

	@Override
	public double calcularPagamento() {
		double valor =super.calcularPagamento()+1000;
		return valor;
	}

	
	
}

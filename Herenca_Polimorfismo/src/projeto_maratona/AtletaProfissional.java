package projeto_maratona;

public class AtletaProfissional extends Maratona{
	double peso;
	
	public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "AtletaProfissional [peso=" + peso + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getIdade()=" + getIdade() + ", getAltura()=" + getAltura() + "]";
	}
	
}

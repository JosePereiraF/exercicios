package projeto_maratona;

public class AtletaAmador extends Maratona{
	boolean atestado;

	public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}

	public boolean isAtestado() {
		return atestado;
	}

	public void setAtestado(boolean atestado) {
		this.atestado = atestado;
	}

	@Override
	public String toString() {
		return "AtletaAmador [atestado=" + atestado + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getIdade()=" + getIdade() + ", getAltura()=" + getAltura() + "]";
	}

	
	
}

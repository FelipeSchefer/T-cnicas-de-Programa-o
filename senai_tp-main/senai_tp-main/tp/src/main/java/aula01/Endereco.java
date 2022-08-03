package aula01;

public class Endereco {

	private String nomeRua;
	private int numero;
	
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [nomeRua=" + nomeRua + ", numero=" + numero + "]";
	}
	
	
	
	
	
}

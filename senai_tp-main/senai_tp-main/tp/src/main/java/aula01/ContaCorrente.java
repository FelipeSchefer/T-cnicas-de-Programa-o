package aula01;

public class ContaCorrente implements Conta{

	@Override
	public void depositar() {
		System.out.println("Depositar Conta Corrente");
	}

	@Override
	public void sacar() {
	System.out.println("Sacar Conta Corrente");
	}

	
}

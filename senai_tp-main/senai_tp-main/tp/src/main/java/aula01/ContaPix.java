package aula01;

public class ContaPix implements Conta{

	@Override
	public void depositar() {
		System.out.println("Depositar Conta Pix");
	}

	@Override
	public void sacar() {
		System.out.println("Sacar Conta Pix");
	}

}

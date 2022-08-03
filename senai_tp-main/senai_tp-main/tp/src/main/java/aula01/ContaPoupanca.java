package aula01;

public class ContaPoupanca implements Conta{

	@Override
	public void depositar() {
		
		System.out.println("Depositando Conta Poupança");
		
	}

	@Override
	public void sacar() {
		System.out.println("Sacando Conta Poupança");		
	}
	
	

}

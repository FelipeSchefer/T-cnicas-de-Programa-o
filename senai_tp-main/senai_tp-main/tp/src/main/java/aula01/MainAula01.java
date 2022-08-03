package aula01;

public class MainAula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generico
		Pessoa p1 = new Pessoa();
		p1.setNome("Felipe");
		p1.setIdade(28);
		
		Endereco end1= new Endereco();
		end1.setNomeRua("Travessa Guatemala");
		end1.setNumero(146);
		
		p1.setEndereco(end1);
		
		System.out.println(p1.toString());

		//Especifico - Porfessor
		Professor prof01 = new Professor();
		prof01.setNome("Schefer");
		prof01.setIdade(27);
		
		Endereco endProf01 = new Endereco();
		endProf01.setNomeRua("Tv Gua 1");
		endProf01.setNumero(145);
		
		prof01.setEndereco(endProf01);
		
		System.out.println(prof01.toString());
		
		// Poupança
		ContaPoupanca cp = new ContaPoupanca();
		chamarDepositar(cp);
		
		//Corrente
		ContaCorrente cc = new ContaCorrente();
		chamarDepositar(cc);
		
		//ContaPix
		ContaPix cPix = new ContaPix();
		chamarDepositar(cPix);
		
	}
	
	//
	public static void chamarDepositar(Conta c) {
		c.depositar();
	}
	
}

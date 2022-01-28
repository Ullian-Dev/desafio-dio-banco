
public class Main {

	public static void main(String[] args) {

		Cliente ullian = new Cliente();
		ullian.setNome("Ullian");
		
		Cliente larissa = new Cliente();
		larissa.setNome("Larissa");
		
		Conta cc1 = new ContaCorrente(ullian);
		Conta poupanca1 = new ContaPoupanca(ullian);
		
		Conta cc2 = new ContaCorrente(larissa);
		Conta poupanca2 = new ContaPoupanca(larissa);

		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		cc1.sacar(50);
		
		cc2.depositar(800);
		cc2.transferir(350, poupanca1);
		cc2.transferir(350, poupanca2);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
	}
	
}

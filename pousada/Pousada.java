package pousada;

public class Pousada {
	public static void main(String[] args) {
		
		Conta lucas = new Conta("Lucas", 10);
		lucas.geraConta();
		Conta paulo = new Conta("Paulo", 5);
		paulo.geraConta();
		Conta.geraLucro();
	}
}

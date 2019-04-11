package pousada;

public class Conta {
	public String 	nome;
	public int 		dias = 0;
	public float 	contacliente = 40;
	
	public Conta(String clientenome, int clientedias) {
		nome = clientenome;
		dias = clientedias;
	}
	
	public static float lucropousada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public float getContacliente() {
		return contacliente;
	}
	public void setContacliente(float contacliente) {
		this.contacliente = contacliente;
	}
	
	public float geraConta() {
		if(getDias() < 10) {
			contacliente = contacliente + (15*getDias());
			System.out.println("O valor da conta de " +getNome() + " foi de: " + contacliente);
			return Conta.lucropousada = Conta.lucropousada + contacliente;
		}
		else {
			contacliente = contacliente + (8*getDias());
			System.out.println("O valor da conta de " +getNome() + " foi de: " + contacliente);
			return Conta.lucropousada = Conta.lucropousada + contacliente;
		}
	}
	
	public static void geraLucro() {
		System.out.println("O lucro total da pousada foi de: " + Conta.lucropousada);
	}
}

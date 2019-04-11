package prefeitura;

public class Funcionario {
	float salario;
	float prestacao;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getPrestacao() {
		return prestacao;
	}

	public void setPrestacao(float prestacao) {
		this.prestacao = prestacao;
	}

	public void calculaCredito() {
		if (getPrestacao() < (getSalario() * 0.30)){
			System.out.println("O crédito será concedido.");
		}
		else {
			System.out.println("Infelizmente sua solicitação não poderá ser atendida.");
		}
	}
}

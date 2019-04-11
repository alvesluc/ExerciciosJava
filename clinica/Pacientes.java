package clinica;

public class Pacientes {
	public String 	nome;
	public String 	sexo;
	public float 	peso = 0;
	public int 		idade = 0;
	public float 	altura = 0;
	
	public static int 	 qtdpacientes = 0;
	public static float  mediaidadehomem= 0;
	public static int 	 qtdmulheres = 0;
	public static int 	 pessoas = 0;
	public static int 	 maisvelho = 0;
	public static String nomemaisvelho;
	public static float  maisbaixa = 3;
	public static String nomemaisbaixa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public static void relatorio() {
		System.out.println("Quantidade de pacientes: " + Pacientes.qtdpacientes);
		System.out.println("Média de idade dos homens: " + Pacientes.mediaidadehomem);
		System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: "
				+ Pacientes.qtdmulheres);
		System.out.println("A quantidade de pessoa com idade entre 18 e 25 anos: "
				+ Pacientes.pessoas);
		System.out.println("Nome do paciente mais velho: " + Pacientes.nomemaisvelho);
		System.out.println("Nome da paciente mais baixa: " + Pacientes.nomemaisbaixa);
	}
	
}

package clinica;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Pacientes paciente = new Pacientes();

		paciente.nome = "."; //condição de inicio do programa.
		
		Scanner leitornome = new Scanner(System.in);
		Scanner leitorsexo = new Scanner(System.in);
		Scanner leitorpeso = new Scanner(System.in);
		Scanner leitoridade = new Scanner(System.in);
		Scanner leitoraltura = new Scanner(System.in);
		
		while (!paciente.nome.equals("fim")){	
			
			System.out.println("Informe o nome do paciente: ");
			String nome = leitornome.nextLine();
			paciente.setNome(nome);
			
			if (paciente.getNome().equals("fim")){
				break;
			}
			
			System.out.println("Informe o sexo do paciente: ");
			String sexo = leitorsexo.nextLine();
			paciente.setSexo(sexo);
			
			System.out.println("Informe o peso do paciente: ");
			float peso = leitorpeso.nextFloat();
			paciente.setPeso(peso);

			System.out.println("Informe a idade do paciente: ");
			int idade = leitoridade.nextInt();
			paciente.setIdade(idade);
			
			System.out.println("Informe a altura do paciente: ");
			float altura = leitoraltura.nextFloat();
			paciente.setAltura(altura);
			
			Pacientes.qtdpacientes++;
			
			if(paciente.getSexo().equals("m")) {
				Pacientes.mediaidadehomem = Pacientes.mediaidadehomem + paciente.idade;
			}
			
			if(paciente.getSexo().equals("f")) {
				if(paciente.getAltura() >= 1.60 || paciente.getAltura() <= 1.70) {
					if(paciente.getPeso() > 70) {
						Pacientes.qtdmulheres++;
					}
				}
			}
			
			if(paciente.getIdade() >= 18 || paciente.getIdade() <= 25) {
				Pacientes.pessoas++;
			}
			
			if(paciente.getIdade() > Pacientes.maisvelho) {
				Pacientes.maisvelho = paciente.getIdade();
				Pacientes.nomemaisvelho = paciente.getNome();
			}
			
			if(paciente.getSexo().equals("f")) {
				if(paciente.getAltura() < Pacientes.maisbaixa) {
					Pacientes.maisbaixa = paciente.getAltura();
					Pacientes.nomemaisbaixa = paciente.getNome();
				}
			}
			
		}
		leitornome.close();
		leitorsexo.close();
		leitorpeso.close();
		leitoridade.close();
		leitoraltura.close();
		Pacientes.relatorio();
	}
}

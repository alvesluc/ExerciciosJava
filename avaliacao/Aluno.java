package avaliacao;

public class Aluno {
	public String nome;
	public float nota1;
	public float nota2;
	public float media;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
		
	public float fazerMedia() {
		System.out.println("A média de " + getNome()
		+ " foi: " + ((getNota1() + getNota2())/2) );
		return media = ((getNota1() + getNota2())/2);
	}
	
	public void avalia() {
		
		if(getMedia() >= 7) {
			System.out.println(getNome() + " foi aprovado.");
		}
		else if(getMedia() > 3 && getMedia() < 7) {
			System.out.println(getNome() + " vai para o exame.");
		}
		else {
			System.out.println(getNome() + " foi reprovado");
		}
	}

}


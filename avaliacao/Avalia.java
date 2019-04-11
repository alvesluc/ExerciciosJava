package avaliacao;

public class Avalia {
	
	public static void main(String[] args) {
			
		Aluno lucas = new Aluno("Lucas", 10, 9);
		Aluno luan = new Aluno("Luan", 6, 6);
		Aluno lael = new Aluno("Lael", 8, 9);
		Aluno doug = new Aluno("Doug", 7, 7);
		Aluno joao = new Aluno("Pedro", 2, 3);
		Aluno wesley = new Aluno("Wesley", 6, 6);

		lucas.fazerMedia();
		luan.fazerMedia();
		lael.fazerMedia();
		doug.fazerMedia();
		joao.fazerMedia();
		wesley.fazerMedia();
		
		lucas.avalia();
		luan.avalia();
		lael.avalia();
		doug.avalia();
		joao.avalia();
		wesley.avalia();
		
		Aluno.informa();
	}
}

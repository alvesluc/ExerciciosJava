package avaliacao;

public class Avalia {
	
	public static void main(String[] args) {
			
		Aluno lucas = new Aluno();
		Aluno luan = new Aluno();
		Aluno lael = new Aluno();
		Aluno doug = new Aluno();
		Aluno joao = new Aluno();
		Aluno wesley = new Aluno();
		
		lucas.setNome("Lucas");
		lucas.setNota1((float)10);
		lucas.setNota2((float)9);
		
		luan.setNome("Luan");
		luan.setNota1((float)6);
		luan.setNota2((float)6);
		
		lael.setNome("Lael");
		lael.setNota1((float)8);
		lael.setNota2((float)9);
		
		doug.setNome("Doug");
		doug.setNota1((float)7);
		doug.setNota2((float)7);
		
		joao.setNome("João");
		joao.setNota1((float)2);
		joao.setNota2((float)3);

		wesley.setNome("Wesley");
		wesley.setNota1((float)6);
		wesley.setNota2((float)6);
		
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

	}

}

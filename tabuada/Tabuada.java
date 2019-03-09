package tabuada;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int i = 1;
		Multiplo base = new Multiplo();
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero para que a tabuada seja exibida: ");
		
		int num = leitor.nextInt();
		base.setNum(num);
		leitor.close();
		
		for(; i <=10; i++) {
			System.out.println(base.getNum() + " x " + i
					+ " = " + (base.getNum()*i));
		}
	}
	
}

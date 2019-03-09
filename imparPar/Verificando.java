package imparPar;

import java.util.Scanner;

public class Verificando {
	
	public static void main(String[] args) {
		
		int i = 0;		
	    Scanner leitor = new Scanner(System.in); 

		for(; i< 10; i++) {
		    System.out.println("Informe um numero inteiro: ");
		    int num = leitor.nextInt();
		    
		    if ((num % 2) == 0) {
	  	    	System.out.println("Par.");
	  	    }
	  	    else {
	  	    	System.out.println("Ímpar.");
	  	    }
		}
		leitor.close();
	}

}

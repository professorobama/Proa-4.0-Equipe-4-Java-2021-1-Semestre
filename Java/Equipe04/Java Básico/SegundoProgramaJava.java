package explicacoes;

import java.util.Scanner;

public class SegundoProgramaJava {
	 
	public static void main(String[]args) {
		 
		 //Entrada de Dados em Java
		 //Classe Scanner
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um número  :");
		 
		 int numero=sc.nextInt();
		  
		 System.out.println("O número digitado foi : "+numero);
		 sc.close();
	 }
}

package explicacoes;

import java.util.Scanner;

public class SegundoProgramaJava {
	 
	public static void main(String[]args) {
		 
		 //Entrada de Dados em Java
		 //Classe Scanner
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um n�mero  :");
		 
		 int numero=sc.nextInt();
		  
		 System.out.println("O n�mero digitado foi : "+numero);
		 sc.close();
	 }
}

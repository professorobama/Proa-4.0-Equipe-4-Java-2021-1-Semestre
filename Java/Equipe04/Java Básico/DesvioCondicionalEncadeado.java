package explicacoes;

public class DesvioCondicionalEncadeado {

	public static void main(String[]args) {
		int valor=33;
		
		if (valor<=10) {
			System.out.println("O número é menor ou igual a 10");
		} else  if ((valor>10)&&(valor<=20)) {
			System.out.println("O número está entre 11 o número 20");
		} else if ((valor>21)&&(valor<=30)) {
			System.out.println("O número está entre 21 o número 30");
		}else if ((valor>31)&&(valor<=40)) {
			System.out.println("O número está entre 31 o número 40");
		}else{
			System.out.println("O número é maior que 40");
		}
	}
}

package explicacoes;

public class DesvioCondicionalEncadeado {

	public static void main(String[]args) {
		int valor=33;
		
		if (valor<=10) {
			System.out.println("O n�mero � menor ou igual a 10");
		} else  if ((valor>10)&&(valor<=20)) {
			System.out.println("O n�mero est� entre 11 o n�mero 20");
		} else if ((valor>21)&&(valor<=30)) {
			System.out.println("O n�mero est� entre 21 o n�mero 30");
		}else if ((valor>31)&&(valor<=40)) {
			System.out.println("O n�mero est� entre 31 o n�mero 40");
		}else{
			System.out.println("O n�mero � maior que 40");
		}
	}
}

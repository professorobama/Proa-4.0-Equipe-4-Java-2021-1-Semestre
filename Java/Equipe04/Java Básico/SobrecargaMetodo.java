package explicacoes;

public class SobrecargaMetodo {

	static int numeroInteiro(int x, int y) {
		return x+y;
	}
	
	static double numeroFlutuante(double x , double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		int numero1=numeroInteiro(8,5);
		double numero2= numeroFlutuante(4.3,6.26);
		System.out.println("O soma dos números inteiros corresponde a :"+numero1);
		System.out.println("O soma dos números flutuantes corresponde a :"+numero2);
	}

}

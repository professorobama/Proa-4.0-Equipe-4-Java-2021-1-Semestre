package explicacoes;

public class SobrecargaMetodo02 {

	static int soma(int x, int y){
		return x+y;
	}
	
	static double soma(double x, double y){
		return x+y;
	}
	
	public static void main(String[] args) {
	
	int numero1=soma(8,5);	
	double numero2=soma(4.3,6.26);
	System.out.println("A soma dos números corresponde a :"+numero1);
	System.out.println("A soma dos números corresponde a :"+numero2);
	}

}

package explicacoes;

public class ExemploIFElse {

	public static void main(String[] args) {
		
		
		int idade = 15;
		
		if (idade<18) {
			System.out.println("Menor");
			float multa= idade*100;
			System.out.println("Multa :"+multa);
		} else {
			System.out.println("Maior");
		//System.out.println("Não deve pagar multa :"+multa);
		}

	}

}

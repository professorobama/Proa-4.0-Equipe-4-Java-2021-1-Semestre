package explicacoes;

public class MetodoComIfElse {

	static void idade(int idade) {
		
		if (idade<18) {
			System.out.println("Acesso negado - Voc� n�o possui idade para acessar esse conteudo.");
		} else {
			System.out.println("Acesso permitido - Voc� possui idade para acessar esse conteudo.");
		}
		
	}
	
	
	public static void main(String[] args) {

		idade(20);
	}

}

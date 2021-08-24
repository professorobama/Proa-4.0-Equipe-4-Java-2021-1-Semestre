package explicacoes;

public class MetodoComIfElse {

	static void idade(int idade) {
		
		if (idade<18) {
			System.out.println("Acesso negado - Você não possui idade para acessar esse conteudo.");
		} else {
			System.out.println("Acesso permitido - Você possui idade para acessar esse conteudo.");
		}
		
	}
	
	
	public static void main(String[] args) {

		idade(20);
	}

}

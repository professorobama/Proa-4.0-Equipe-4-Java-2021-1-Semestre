package explicacoes;

public class MetodoComPassagemParametro02 {

	//Cria��o de m�todo
	
	static void nomeCompleto(String nome,String nomeMeio,String sobrenome) {
		System.out.println("O nome Completo �: "+nome+" "+nomeMeio+" "+sobrenome);
	}
	
	
	public static void main(String[] args) {
		
		nomeCompleto("Jailson","Costa","Santos");
		nomeCompleto("Ana", "Luiza", "Fernandes");

		
	}

}

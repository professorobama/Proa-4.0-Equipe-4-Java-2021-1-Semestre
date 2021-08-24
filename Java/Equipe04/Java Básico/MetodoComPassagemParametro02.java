package explicacoes;

public class MetodoComPassagemParametro02 {

	//Criação de método
	
	static void nomeCompleto(String nome,String nomeMeio,String sobrenome) {
		System.out.println("O nome Completo é: "+nome+" "+nomeMeio+" "+sobrenome);
	}
	
	
	public static void main(String[] args) {
		
		nomeCompleto("Jailson","Costa","Santos");
		nomeCompleto("Ana", "Luiza", "Fernandes");

		
	}

}

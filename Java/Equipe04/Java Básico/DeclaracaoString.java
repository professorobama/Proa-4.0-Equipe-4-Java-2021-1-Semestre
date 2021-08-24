package explicacoes;

public class DeclaracaoString {

	public static void main(String[] args) {
		
		String saudacao= "Olá ";
		
		String nomeCompleto="Jailson Costa dos Santos";
		
		String universidade= "Universidade \"Lobo\" Guara";
		
		String musica= "It\'s Alright";
		
		System.out.println(saudacao+" "+"Usuário");
		
		System.out.println("A quantidade de caracteres do texto corresponde a:"+nomeCompleto.length());
		
		System.out.println(nomeCompleto.toLowerCase());
		
		System.out.println(nomeCompleto.toUpperCase());
		
		System.out.println(nomeCompleto.indexOf("Costa"));
		
		System.out.println(saudacao.concat(nomeCompleto));
		
		System.out.println(universidade);
		
		System.out.print(musica+"\n");
		
		System.out.print(nomeCompleto);
		
		System.out.println("Uma frase Diego");
		
	}

}

package explicacoes;

public class ExercicioMetodocomParametro {

	
	static void cadastroAluno(
			String nome, String nomeMeio, String sobrenome,
			int idade, char sexo, String lpPreference){
		System.out.println("Nome completo :"+ nome +" "+nomeMeio+ " "+sobrenome);
		System.out.println("Idade :"+idade);
		System.out.println("Sexo: "+sexo);
		System.out.println("A linguagem de programação preferida é: "+lpPreference);
		
	}
	
	public static void main(String[] args) {
	
		cadastroAluno("Agostinho","Carrara","da Silva",87,'m',"Cobol");
		System.out.println("----------------------------------------");
		cadastroAluno("Rafael","Carlos","junior",27,'m',"Java");
	}

}

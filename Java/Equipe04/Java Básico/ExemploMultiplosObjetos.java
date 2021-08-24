package explicacoes;

public class ExemploMultiplosObjetos {

	int x = 5;
	
	public static void main(String[] args) {
	
		ExemploMultiplosObjetos objeto1 = new ExemploMultiplosObjetos();
		ExemploMultiplosObjetos objeto2 = new ExemploMultiplosObjetos();
		
		System.out.println("Objeto 01: "+objeto1.x);
		System.out.println("Objeto 02: "+objeto2.x);
	}

}

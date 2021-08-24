package explicacoes;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if ((i == 4) ||(i==8)) {
				continue;
			}
			System.out.println(i);
		}
	}
}
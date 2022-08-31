package aula02;

public class ExemploIfElse {

	public static void main(String[] args) {
		// A - Um atleta poderá participar de uma maratona caso
		// a idade seja superior ou altura maior ou igual a 1.80

		int idade = 19;
		double altura = 1.65;

		if (idade > 18 || altura >= 1.80) {
			System.out.println("Pode competir! ");
		} else {
			System.out.println("Não pode competir! ");
		}
		// A1
		String resposta1 = idade > 18 || altura >= 1.80 ? "Pode competir! " : "Não pode competir! ";
		// A2
		System.out.println(resposta1);

		// B - criar duas variáveis com um valor inicial
		// e com ternário comparar qual maior valor.
		
		//	Integer arg0 = Integer.parseInt(args[0]);
		//	Integer arg1 = Integer.parseInt(args[1]);
		//	Integer resp = arg0 > arg1 ? arg0 : arg1;
		//	System.out.println(resp);
	}
}

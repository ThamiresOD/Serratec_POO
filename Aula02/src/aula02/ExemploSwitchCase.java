package aula02;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		int mes = 5;
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
		break;
		case 2:
			System.out.println("Fevereiro");
		break;
		case 3:
			System.out.println("Março");
		break;
		case 4:
			System.out.println("Abril");
		break;
		case 5:
			System.out.println("Maio");
		break;

		default:
			System.out.println("Mês inválido !");
			break;
		}

	}
}

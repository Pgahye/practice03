package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			/* 코드를 완성 합니다 */
			String text = scanner.nextLine();

			if (text.equals("quit")) {

				break;

			} else {

				String[] tokens = text.split(" ");

				int a = Integer.parseInt(tokens[0]);
				int b = Integer.parseInt(tokens[2]);

				if (tokens[1].equals("+")) {

					Add add1 = new Add();
					add1.setValue(a, b);
					add1.calculate();

				}
				if (tokens[1].equals("-")) {

					Sub add1 = new Sub();
					add1.setValue(a, b);
					add1.calculate();

				}
				if (tokens[1].equals("*")) {

					Mul add1 = new Mul();
					add1.setValue(a, b);
					add1.calculate();

				}

				if (tokens[1].equals("/")) {

					Div add1 = new Div();
					add1.setValue(a, b);
					add1.calculate();

				}

			}

		}

		// scanner.close();

	}

}

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String op = sc.next();
		int result = 0;
		
		switch(op) {
			case "+":
				result = n1 + n2;
				break;
			case "-":
				result = n1 - n2;
				break;
			case "*":
				result = n1 * n2;
				break;
			case "/":
				result = n1 / n2;
				break;
			default:
				System.out.println("니 머하노 연산자 제대로 적지도 못하나 4개밖에 안되는걸 븅신이노...");
		}
		
		System.out.println(result);

	}

}

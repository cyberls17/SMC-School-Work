import java.util.Scanner;

public class sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자: ");
		int a = sc.nextInt();
		System.out.print("마지막 숫자: ");
		int b = sc.nextInt();
		sc.close();
		int result = 0;
		for(int i=a;i<=b;i++)
		{
			result += i;
		}
		System.out.println(a + "부터 " + b + "까지의 합은 " + result);
	}

}

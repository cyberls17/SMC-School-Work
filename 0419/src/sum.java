import java.util.Scanner;

public class sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ����: ");
		int a = sc.nextInt();
		System.out.print("������ ����: ");
		int b = sc.nextInt();
		sc.close();
		int result = 0;
		for(int i=a;i<=b;i++)
		{
			result += i;
		}
		System.out.println(a + "���� " + b + "������ ���� " + result);
	}

}

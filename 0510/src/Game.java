import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int assertive = (int)(Math.random()*3+1);
		System.out.println("���� ���� ��!");
		String input = scan.nextLine();
		if(assertive == 1)
		{
			System.out.println("����");
		}
	}
}
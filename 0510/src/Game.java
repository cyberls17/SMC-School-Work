import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int assertive = (int)(Math.random()*3+1);
		System.out.println("가위 바위 보!");
		String input = scan.nextLine();
		if(assertive == 1)
		{
			System.out.println("가위");
		}
	}
}
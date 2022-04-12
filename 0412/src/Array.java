import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번 입력 :");
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = 0;
		int count = 0;

		for (int j = 0; j < 5; j++) {
			if (array[j] > max) {
				max = array[j];
				count = j + 1;
			}
		}
		
		System.out.println("가장 큰 수는 " + count + "번째인 " + max);

	}

}
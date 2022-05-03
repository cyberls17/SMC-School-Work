import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("500 이하의 자연수를 입력하세요.");
		int num = sc.nextInt();
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int count = 0;
		int result = 0;
		if(num<=500 && num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(i%3==0 && i%7==0) {
					array[i] = num;
					count++;
				}
			}
		}
		for(int j=1;j<=count;j++) {
			System.out.println(array[j]);
			result += array[j];
		}
		System.out.println("1~" + num + "까지 3의 배수이면서 7의 배수인 수의 합은 " + result + "입니다.");
		
	}

}

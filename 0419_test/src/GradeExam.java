import java.util.Scanner;

public class GradeExam {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Grade me = new Grade();
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();
		sc.close();
		System.out.println("����� " + me.average());
	}

}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}
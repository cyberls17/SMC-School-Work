
public class TriangleExam {

	public static void main(String[] args) {

		Triangle tr1 = new Triangle(10.2, 17.3);
		System.out.println("ù ��° �ﰢ���� ���̴� " + tr1.Area() + " �Դϴ�.");
		tr1.edit(7.5, 9.2);
		System.out.println("�� ��° �ﰢ���� ���̴� " + tr1.Area() + " �Դϴ�.");
		
		
	}

}

class Triangle {
	double width;
	double height;
	public Triangle(double a, double b) {
		this.width = a;
		this.height = b;
	}
	public double Area() {
		return width*height/2;
	}
	public void edit(double a, double b) {
		this.width = a;
		this.height = b;
	}
}
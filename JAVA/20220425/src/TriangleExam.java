
public class TriangleExam {

	public static void main(String[] args) {

		Triangle tr1 = new Triangle(10.2, 17.3);
		System.out.println("첫 번째 삼각형의 넓이는 " + tr1.Area() + " 입니다.");
		tr1.edit(7.5, 9.2);
		System.out.println("두 번째 삼각형의 넓이는 " + tr1.Area() + " 입니다.");
		
		
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
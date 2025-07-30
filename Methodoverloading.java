class Shape{
	public int area(int side) {
		System.out.println("I am square");
		return side*side;
		
	}
	public int area(int l,int b) {
		System.out.println("I am rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("I am circle");
		return 3.14f*radius*radius;
	}
}

public class Methodoverloading {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println("Area is:"+s1.area(5));
		Shape s2 = new Shape();
		System.out.println("Area is:"+s2.area(5,2));
		Shape s3 = new Shape();
		System.out.println("Area is:"+s3.area(3f));
	}

}

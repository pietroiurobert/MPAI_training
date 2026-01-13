package patterns.ep1.factory.shapes;

public class Circle extends Shape {
	
	
	@Override
	public double getArea() {
		return x * x * Math.PI;
	}

}

package patterns.ep1.factory.shapes;

public abstract class Shape {
	
	public abstract double getArea();
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	protected int x;
}

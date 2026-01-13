package patterns.ep1.factory;

import patterns.ep1.factory.shapes.Circle;
import patterns.ep1.factory.shapes.Shape;
import patterns.ep1.factory.shapes.Square;

public class ShapeFactory {
	public static Shape getShape(ShapeType type){
		Shape shape = null;
		switch (type) {
		case SQUARE:
			shape = new Square();
			break;
		case CIRCLE:
			shape = new Circle();
			break;
		default:
			break;
		}
		return shape;
		
	}
}

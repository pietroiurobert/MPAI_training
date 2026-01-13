package simpleprivatedata.domain;

public class Circle {

    private CircleData circleData;

    public Circle(double radius, Point origin) {
        this.circleData = new CircleData(radius, origin);
    }

    public double getCircumference() {
        return this.circleData.getRadius() * Math.PI;
    }

    public double getDiameter() {
        return this.circleData.getRadius() * 2;
    }

    public void draw() {
        System.out.println("drawing circle");
    }
}
